<%--
  Created by IntelliJ IDEA.
  User: array
  Date: 11.02.2022
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new array</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Sort Array Project!</h1>
</div>

<div class="w3-container w3-padding">
    <%
        if (request.getAttribute("myArray") != null) {
            out.println("<div class=\"w3-panel w3-green w3-display-container w3-card-4 w3-round\">\n" +
                    "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                    "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">×</span>\n" +
                    "   <h5>Массив сохранен! " + request.getAttribute("myArray") + "</h5>\n" +
                    "</div>");
        }

    %>
    <div class="w3-card-4">
        <div class="w3-container w3-center w3-green">
            <h2>Введите 5 целых чисел</h2>
        </div>
        <form method="post" class="w3-selection w3-light-grey w3-padding">
            <style>
                ul.hr {
                    /* Обнуляем значение отступов и полей */
                    margin: 0; padding: 0;
                }
                ul.hr li {
                    display: inline-block; /* Строчно-блочный элемент */
                    border: 1px solid #000; /* Рамка вокруг текста */
                    padding: 3px; /* Поля вокруг текста */
                }
            </style>
            <ul class="hr">
                <li>
                    <label>First number:
                        <input type="number" name="first" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                    </label>
                </li>
                <li>
                    <label>Second number:
                        <input type="number" name="second" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                    </label>
                </li>
                <li>
                    <label>Third number:
                        <input type="number" name="third" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                    </label>
                </li>
                <li>
                    <label>Fourth number:
                        <input type="number" name="fourth" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                    </label>
                </li>
                <li>
                    <label>Fifth number:
                        <input type="number" name="fifth" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                    </label>
                </li>
            </ul>
            <p><button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Сохранить</button></p>
        </form>
    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-black w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>

