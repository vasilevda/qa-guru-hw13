# Автоматизация тестирования сайта компании Северсталь

## :rocket: Технологии и инструменты

<p  align="center">

<code><img width="5%" title="IntelliJ IDEA" src="images/IDEA-logo.svg"></code>
<code><img width="5%" title="Java" src="images/java-logo.svg"></code>
<code><img width="5%" title="Selenide" src="images/selenide-logo.svg"></code>
<code><img width="5%" title="Selenoid" src="images/selenoid-logo.svg"></code>
<code><img width="5%" title="Gradle" src="images/gradle-logo.svg "></code>
<code><img width="5%" title="JUnit5" src="images/junit5-logo.svg"></code>
<code><img width="5%" title="Allure Report" src="images/allure-Report-logo.svg"></code>
<code><img width="5%" title="Github" src="images/git-logo.svg"></code>
<code><img width="5%" title="Jenkins" src="images/jenkins-logo.svg"></code>
<code><img width="5%" title="Telegram" src="images/Telegram.svg"></code>

</p>


>*В данном проекте автотесты написаны на <code><strong>*Java*</strong></code> с использованием фреймворка <code><strong>*Selenide*</strong></code>.*
>*Для сборки проекта используется <code><strong>*Gradle*</strong></code>.*
>
>*<code><strong>*JUnit 5*</strong></code> используется как фреймворк для модульного тестирования.*
>
>*Запуск тестов выполняется из <code><strong>*Jenkins*</strong></code>.*
>
>*<code><strong>*Selenoid*</strong></code> используется для запуска браузеров в контейнерах  <code><strong>*Docker*</strong></code>.*
>
>*<code><strong>*Allure Report, Telegram Bot*</strong></code> используются для визуализации результатов тестирования.*



## <img width="4%" title="Jenkins" src="images/jenkins-logo.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/C07-daramirra-diploma/)

### :pushpin: Параметры сборки

```bash
gradle clean test 
-Dbrowser=${browser}
-DbrowserVersion=${browserVersion}
-Dremote=${remote}
-Dlogin=${login}
-Dpassword=${password}
```

где:
>- [x] *Dbrowser - браузер, в котором будут выполняться тесты (по умолчанию chrome)*
>- [x] *DbrowserVersion - версия браузера (по умолчанию 91.0)*
>- [x] *Dremote - адрес удаленного сервера, где будут выполняться тесты (по умолчанию https://[login]:[password]@selenoid.autotests.cloud/wd/hub/)*
>- [x] *Dlogin - логи для авторизации в Selenide
>- [x] *Dpassword - пароль для авторизации в Selenide


&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:green_circle:&nbsp;&nbsp;*Сформировать allure отчет:*

```bash
allure serve build/allure-results
```

*Для запуска сборки необходимо указать значения параметров и нажать кнопку <code><strong>*Собрать*</strong></code>.*

<p align="center">
  <img src="images/job_param.png" alt="job" width="800">
</p>

*После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок <img width="2%" title="Allure Report" src="images/allure-Report-logo.svg"><code><strong>*Allure
Report*</strong></code>, кликнув по которому, откроется страница с сформированным html-отчетом.*

<p align="center">
  <img src="images/Allure jobs history.png" alt="job" width="1000">
</p>

## <img width="4%" title="Allure Report" src="images/allure-Report-logo.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/C07-daramirra-diploma/8/allure/)

### :pushpin: Общая информация

*Главная страница Allure-отчета содержит следующие информационные блоки:*

> - [x] <code><strong>*ALLURE REPORT*</strong></code> - отображает дату и время прохождения теста, общее количество прогнанных кейсов, а также диаграмму с указанием процента и количества успешных, упавших и сломавшихся в процессе выполнения тестов
>- [x] <code><strong>*TREND*</strong></code> - отображает тренд прохождения тестов от сборки к сборке
>- [x] <code><strong>*SUITES*</strong></code> - отображает распределение результатов тестов по тестовым наборам
>- [x] <code><strong>*CATEGORIES*</strong></code> - отображает распределение неуспешно прошедших тестов по видам дефектов
<p align="center">
  <img src="images/Allure Report.png" alt="Allure Report" width="900">
</p>

### :pushpin: Список тестов c описанием шагов и визуализацией результатов

*На данной странице представляется стандартное распределение выполнявшихся тестов по тестовым наборам или классам, в
которых находятся тестовые методы.*

<p align="center">
  <img src="images/Allure Report steps.png" alt="Allure Report" width="900">
</p>

### :pushpin: Тест-кейсы

<p align="center">
  <img src="images/Test cases.png" alt="test cases" width="900">
</p>

## <img width="4%" title="Selenoid" src="images/selenoid-logo.svg"> Пример запуска теста в Selenoid

<p align="center">
  <img src="images/video.gif" alt="video" width="1000">
</p>

## <img width="4%" title="Telegram" src="images/Telegram.svg"> Уведомления в Telegram

<p align="center">
  <img src="images/tlgrm.png" alt="Telegram" width="440">
  <img src="images/tlgrm_.png" alt="Telegram" width="390">
</p>
:wink: