<?php
session_start();
?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <link href="css/estilos.css" rel="stylesheet">
    <link href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
    <link href="https://fonts.googleapis.com/css?family=Muli:400,700" rel="stylesheet">
  </head>
  <body>
    <header class="site-header">
      <div class="contenedor">
        <div class="navegacion">
          <nav>
            <div class="logo">
              <img src="img/playrobot.png" alt="logo playrobot" width="85rem" >
            </div>
            <ul>
              <li><a href="login.php">Inicio</a>
            </ul>
          </nav>
        </div>
      </div>
    </header>
    <main class="login">
      <h2>Inicio de sesión</h2><br><br>
      <section id="contacto" class="contacto">
        <form action="validar_login.php" method="post">
          <div class="contenedor-campos">
            <div class="campo w-100">

              <input type="text" name="usuario" placeholder="Usuario" >
            </div>
            <div class="campo w-100">

              <input type="password" name="contrasena" placeholder="Contraseña">
            </div>
          </div>
          <div class="log">

            <input type="submit" class="boton" name="submit" value="iniciar">
          </div>
        </form>
      </section>
    </main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
