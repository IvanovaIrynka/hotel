<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <#include "styleCustomer.html">
    <link rel="stylesheet" href="styleCustomer.html">
    <title>Rooms</title>
</head>
<body>
<div class="header">
    <div class="inner-header flex">
        <h1>Room table <small> <a class="menuLink" href="https://t.me/cut3_iro4ka">by Ivanova Iryna</a></small></h1>
    </div>
    <div >
        <h1><a  class="home" href="http://localhost:8080/#home">Home</a></h1>
        <h1><a  class="back" href="http://localhost:8080/api/v1/customers/">Customer API</a></h1>
    </div>


    <div>
        <svg class="waves" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"
             viewBox="0 24 150 28" preserveAspectRatio="none" shape-rendering="auto">
            <defs>
                <path id="gentle-wave" d="M-160 44c30 0 58-18 88-18s 58 18 88 18 58-18 88-18 58 18 88 18 v44h-352z" />
            </defs>
            <g class="parallax">
                <use xlink:href="#gentle-wave" x="48" y="0" fill="rgba(255,255,255,0.7" />
                <use xlink:href="#gentle-wave" x="48" y="3" fill="rgba(255,255,255,0.5)" />
                <use xlink:href="#gentle-wave" x="48" y="5" fill="rgba(255,255,255,0.3)" />
                <use xlink:href="#gentle-wave" x="48" y="7" fill="#fff" />
            </g>
        </svg>
    </div>
</div>


<div class="container">
 <br><br><br>
<table>
    <tr class="table-header">
        <th>ID</th>
        <th>Name</th>
        <th>Comfort</th>
        <th>Capacity</th>
        <th>Price</th>
        <th>Description</th>
        <th>Updated</th>
        <th>Created</th>
        <th>Delete</th>
        <th>Edit</th>
    </tr>
    <tbody>
    <#list rooms as room>
        <tr>
            <td>${room.id}</td>
            <td>${room.name}</td>
            <td>${room.comfort}</td>
            <td>${room.capacity}</td>
            <td>${room.price}</td>
            <td>${room.description}</td>
            <td>
                <#if room.updatedAt??>${room.updatedAt}
                <#else >No information
                </#if>
            </td>
            <td>
                <#if room.createdAt??>${room.createdAt}
                <#else >No information
                </#if>
            </td>

            <td>
                <a class = "button1" href="/ui/v1/rooms/delete/${room.id}"
                   onclick="return confirm('Are you sure you want to delete this room with name  ${room.name}?');"
                   type="submit">
                    Delete
                </a>
            </td>
            <td>
                <a class = "button2" href="/ui/v1/rooms/edit/${room.id}" type="submit">
                    Edit
                </a>
            </td>
        </tr>
    </#list>
</table>
    <br>
    <br>
</div>
<br><br><br><br><br>
<div class="footer">
    <p><a  class = "button3" href="/ui/v1/rooms">Add new room</a></p>
</div>
</body></html>