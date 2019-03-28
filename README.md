# QA-Tests-SSP
UI тесты на SSP (Advertiser и Publisher)

##Модули:
#### ssp-adv-web-tests 
тесты SSP Advertiser. 
TC build configuration [QA::SSP::QA_SSP_ADV_Stable_Tests](http://teamcity.propellerdev.com/admin/editBuild.html?id=buildType:QA_SspTestParallel)

#### ssp-pub-web-tests 
тесты SSP Publisher 
TC build configuration [QA::SSP::QA_SSP_PUB_Stable_Tests](http://teamcity.propellerdev.com/admin/editBuild.html?id=buildType:QA_SspPubTestParallel)

 
#### ssp-test-core
* Domain объеты, такие как DB и REST Entity, объекты с тестовыми данными  **SspCampaign**, **SspAdvertiser** и **SspPublisher**
* Enum с параметрами и необходимыми константами
* Конфиг тестового окружения **WebTestConfiguration**
* Page-классы. Разбиты на 3 пакета - adv, pub, common (используемые всеми тестами вне зависимости от вида партнерки)
* Util классы
 
#### api-client
Включает в себя базовую инфрастурктуру взаимодействия с БД ADP и rest API ADP и SSP и реализацию, позволяющую выполять следующие дествия:
1. Регистрация адвертов, паблишеров, изменение их состояния, заданного интерфейсами **AdvertiserParam**, **PublisherParam**
2. Создание любых типов кампаний в любых состояниях, заданных интерфейсом **CampaignParam**
3. Получение, чтение и запись в БД необходимых для тестов объектов

#### preconditions-persistence
Включает в себя реализацию механизма создания, сохранения preconditions в Consul и получения их.
Все preconditions описаны в файле preconditions.json
TC build configuration [QA::SSP::QA_SSP_Consul_Data_Build](http://teamcity.propellerdev.com/admin/editBuild.html?id=buildType:QA_QaSspConsulDataBuild)


#### Запуск локально
1. Установить JDK 1.8, maven 3.3.9 or high
2. Убедиться, что IP машины, на котрой буду запускаться тесты, присутсвует в whitelist - [как посмотреть и добавить](https://jira.propellerdev.com/browse/SSP-579?focusedCommentId=15096&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#comment-15096)
3. Убедиться, что с машины, на котрой буду запускаться тесты, есть доступ к БД ADP стэйджа (по умолчанию, понадобится доступ к БД 100 стэйджа) 
[see #1](https://jira.propellerdev.com/browse/JIS-50) [see #2](https://jira.propellerdev.com/browse/SLS-198)

4. Запустить тесты, вызвав в директории проекта
```
$ mvn clean test site -Duser.timezone=EST -Dselenide.browser=chrome -Dis.local=true -Dis.remote=false -Duse.cbt=false -Duse.sauce.labs=false -Dselenide.timeout=24000 -Dselenide.collectionsTimeout=24000 -Dwait.until.timeout=24000
```
где:
* `-Dselenide.browser=chrome` – Имя браузера
* `-Duser.timezone=EST` – Timezone, используюмая в ADP и SSP по умолчанию
* `-Dis.local=true` – Если параметр стоит в true, то не используется RemoteWebDriver, тесты выполняются локально
* `-Dis.remote=false` – Параметр может быть в true только в сочетании с -Dis.local=false. Признак запуска тестов в Selenoid
* `-Duse.cbt=false` – Параметр может быть в true только в сочетании с -Dis.local=false. Признак запуска тестов в [CBT](https://app.crossbrowsertesting.com)
* `-Duse.sauce.labs=false` – Параметр может быть в true только в сочетании с -Dis.local=false. Признак запуска тестов в [saucelabs](https://saucelabs.com/)
* `-Dselenide.timeout=24000 -Dselenide.collectionsTimeout=24000 -Dwait.until.timeout=24000` –  Длительность ожиданий в тестах в мс, при меньших значениях могут быть  случайные падения.

(!) По умолчанию тесты запустятся на 100 стэйдже, т.к. его параметры указаны в классах конфигураций:
**ApiConfiguration** и **WebTestConfiguration**
Если необходим запуск на другом стэйдже, необходимо передать следующие параметры (на примере **101 стэйджа**):
```
-Dssp.url=http://ssp-stg101.rtty.in -Dadp.api.host=adp-stg101.rtty.in -Dadp.api.globalurl=http://adp-stg101.rtty.in/api/v1/ -Dssp.api.globalurl=http://ssp-stg101.rtty.in/v1.0/ -Dadp.db.host=adp-stg101.rtty.in
```

 #### Запуск на TeamCity тестов ADV
 1. Открыть TC build configuration [QA::SSP::QA_SSP_ADV_Stable_Tests](http://teamcity.propellerdev.com/admin/editBuild.html?id=buildType:QA_SspTestParallel)
 2. Перейти к Run Custom Build - Parameters
 3. Во вкладке Changes выбрать *PR ID adp-partners* (SSP), или оставить <Default Branch> для запуска на SSP master
 4. Во вкладке  Parameters,  если не указано обратное, параметр необходимо оставить по умолчанию. Редактируемые параметры:
 * `emails` – Список тех, кто получит письмо с отчетом о прогоне тестов
 * `ENV_TESTS` – Окружение на котором будут запущены тесты, варианты stg100, stg101, predProd
 * `ADP stage branch` – branch, который будет задеплоен на ADP перед тестами. по умолчанию - master
 * `slack` – Slack канал, куда придут уведомления о результатах тестов
 * `tests_suites` - Наборы тестов для запуска, если нужны все тесты - оставляем по умолчанию **All**.  В случае выбора какого-либо специфичного сьюта, **All** не должен быть отмечен

 #### Запуск на TeamCity тестов PUB
 аналогичен таковому для ADV, выполняется из TC build configuration [QA::SSP::QA_SSP_PUB_Stable_Tests](http://teamcity.propellerdev.com/admin/editBuild.html?id=buildType:QA_SspPubTestParallel)
