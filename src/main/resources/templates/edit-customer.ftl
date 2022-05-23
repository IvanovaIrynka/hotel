<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body {
            min-height: 81.4vh;
            background: linear-gradient(0deg, #fff, rgb(234, 164, 164));
            font-family: 'Rubik', sans-serif;
            background-repeat: no-repeat;
            overflow: hidden
        }


        .registration-form{
            padding: 45px 0;
        }

        .registration-form form{
            background-color: #fff;
            max-width: 600px;
            margin: auto;
            padding: 50px 70px;
            border-top-left-radius: 30px;
            border-top-right-radius: 30px;
            box-shadow: 0px 2px 10px rgba(103, 100, 100, 0.07);

        }





        .registration-form .create-account{
            border-radius: 30px;
            padding: 10px 20px;
            font-size: 18px;
            font-weight: bold;
            background-color: #f6b2b2;
            border: none;
            color: white;
            margin-top: 20px;
        }








    </style>
</head>
<body>
<div class="container">
    <div class="registration-form">

        <h4 align="center"> Update information about client</h4>
        <div class="label">

        <form name="EditCustomer" action="" method="POST" >

            <div class="form-group" title="name of customer">
                <label>Name:</label>
                <input type="text"  class="form-control item"
            <@spring.formInput "edit.name" "" "text" /></div>

            <div class="form-group"><label>Surname:</label>
                <input type="text"  class="form-control item"
             <@spring.formInput "edit.surname" "" "text" /></div>

            <div class="form-group"><label>Patronymic:</label>
                <input type="text"  class="form-control item"
             <@spring.formInput "edit.patronymic" "" "text" /></div>

            <div  align="center">
                Birthday: <@spring.formInput "edit.birthday" "" "date" /></div>

            <div class="form-group"><label>Phone number:</label>
                <input type="text"  class="form-control item"
             <@spring.formInput "edit.phoneNumber" "" "text" /></div>

            <div class="form-group"><label> Room in a hotel:</label>
                <input type="text"  class="form-control item"
                        <@spring.formInput "edit.roomInAHotel" "" "text" /></div>

            <div class="form-group">
                <label>Description</label>
                <input type="text"  class="form-control item"
                <@spring.formInput "edit.description" "" "text" /></div>

            <details>
                <summary>You  want to change the time the client was added?</summary>
                <div class="form-group"><p></p>
                Created: <@spring.formInput "edit.createdAt" "" "date"/> </div>
            </details>
            <input type=submit value="Update" class="btn btn-block create-account">


        </form>
        </div>

</div>

</div>

</body>
</html>