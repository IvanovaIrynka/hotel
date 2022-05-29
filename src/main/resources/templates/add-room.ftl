<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <meta charset="UTF-8">
    <title>Add room</title>
    <style>
        body {
            min-height: 81.4vh;
            background: linear-gradient(0deg, #fff, rgb(161, 245, 220));
            font-family: 'Rubik', sans-serif;
            background-repeat: no-repeat;
            overflow: hidden
        }


        .registration-form{
            padding: 50px 0;
        }

        .registration-form form{
            background-color: #fff;
            max-width: 600px;
            margin: auto;
            padding: 50px 70px;
            border-top-left-radius: 30px;
            border-top-right-radius: 30px;
            box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);

        }



        .registration-form .item{
            border-radius: 20px;
            margin-bottom: 25px;
            padding: 10px 20px;
        }

        .registration-form .create-account{
            border-radius: 30px;
            padding: 10px 20px;
            font-size: 18px;
            font-weight: bold;
            background-color: #9aafe5;
            border: none;
            color: white;
            margin-top: 20px;
        }
        @media (max-width: 576px) {
            .registration-form form{
                padding: 50px 20px;}}









    </style>
</head>
<body>
<div class="container">
    <div class="registration-form">

        <h4 align="center"> Add new Room</h4>
        <div class="label">

            <form name="addRoom" action="" method="POST" >

                <div align="center" class="form-group">
                    <input type="text" placeholder="Room name" class="form-control item" <@spring.formInput "form.name" "" "text" />  </div>

                <div align="center" class="form-group">
                    <input type="text" placeholder="Comfort" class="form-control item" <@spring.formInput "form.comfort" "" "text" /></div>

                <div align="center" class="form-group">
                    <input type="text" placeholder="Capacity" class="form-control item" <@spring.formInput "form.capacity" "" "text" /></div>

                <div align="center" class="form-group">
                    <input type="text" placeholder="Price"  class="form-control item" <@spring.formInput "form.price" "" "text" /></div>

                <div align="center" class="form-group">
                    <input type="text" placeholder="Description" class="form-control item"  <@spring.formInput "form.description" "" "text" />
                </div>

                <input type=submit value="Add room" class="btn btn-block create-account">


                <br>

            </form>
        </div>

    </div>

</div>

</body>
</html>