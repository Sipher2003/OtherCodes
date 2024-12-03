<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #333;
        }

        .home-container {
            background-color: #fff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 100%;
            max-width: 600px;
        }

        h1 {
            font-size: 2.5em;
            color: #007BFF;
        }

        .welcome-text {
            font-size: 1.2em;
            margin: 20px 0;
            color: #555;
        }

        .action-btn {
            display: inline-block;
            padding: 12px 25px;
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            font-size: 1.1em;
            border-radius: 5px;
            margin-top: 20px;
            cursor: pointer;
        }

    </style>
</head>
<body>

    <div class="home-container">
        <h1>Welcome to the Home Page</h1>
        <p class="welcome-text">You have successfully logged in!</p>
    </div>


</body>
</html>
