<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error - Something Went Wrong</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #333;
        }

        .error-container {
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
            color: #e74c3c;
        }

        p {
            font-size: 1.2em;
            margin: 20px 0;
            color: #555;
        }

        .error-btn {
            display: inline-block;
            padding: 12px 25px;
            background-color: #3498db;
            color: white;
            text-decoration: none;
            font-size: 1.1em;
            border-radius: 5px;
            margin-top: 20px;
            cursor: pointer;
        }

        .error-btn:hover {
            background-color: #2980b9;
        }

      
    </style>
</head>
<body>

    <div class="error-container">
        <h1>Error</h1>
        <p>${error}</p> <!-- Dynamically display error message -->
        <a href="/" class="error-btn">Go Back to Login</a>
    </div>

    
</body>
</html>
