<%@ page import="java.util.List" %>
<%@ page import="modelo.Orador" %>
<%@ page import="util.OradorDAO" %>
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Login Exitoso</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">
    <style>
        body {
            background-color: #052e2e;
        }

        .container {
            margin-top: 5%;
        }

        .card {
            background-color: #052e2e;
        }

        .card-body {
            color: #fafafc;
        }

        /* Estilos para el texto en la parte media de la página */
        .middle-text {
            text-align: center;
            margin-top: 50px;
        }

        /* Estilos para el elemento de loading animado */
        .loading {
            text-align: center;
            margin-top: 20px;
        }

        .loading-spinner {
            border: 8px solid #f3f3f3;
            border-top: 8px solid #3498db;
            border-radius: 50%;
            width: 50px;
            height: 50px;
            animation: spin 1s linear infinite;
            margin: auto; /* Centra horizontalmente */
        }

        @keyframes spin {
            0% {
                transform: rotate(0deg);
            }

            100% {
                transform: rotate(360deg);
            }
        }
    </style>
</head>

<body>

    <div class="container mt-5">
        <div class="middle-text">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body text-center">
                        <h1 class="display-4">¡Inicio de sesión Exitoso!</h1>
                        <br />
                        <h3>
                            <p class="lead">¡ Bienvenid@ Móni !</p>
                        </h3>
                    </div>
                </div>
            </div>
        </div>

        <br
            <br  

        <!-- Elemento de loading animado -->
        <div class="loading">
            <div class="loading-spinner"></div>
        </div>
    </div>

    <!-- Agrega enlaces a Bootstrap JS y otros scripts aquí -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+WyBkWOH6aWqEn1RSVRxQenEEAP5vA1bKGf"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+WyBkWOH6aWqEn1RSVRxQenEEAP5vA1bKGf"
        crossorigin="anonymous"></script>
</body>

</html>
    <script>
        // Agrega una redirección a la lista de oradores después de un breve retraso 
        setTimeout(function () {
            window.location.href = "listaOradores.jsp";
        }, 4000); // 2000 milisegundos = 2 segundos 
    </script>

    


