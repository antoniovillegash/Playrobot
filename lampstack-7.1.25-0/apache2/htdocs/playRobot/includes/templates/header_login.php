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
              <li><a href="index.php">Inicio</a>
              <li><a href="#">Alumnos</a>
                <ul>
                  <li><a href="ver_alumnos.php">Ver alumnos</a></li>
                  <li><a href="registro_de_alumno.php">Registrar alumno</a></li>
                  <li><a href="agregar_hermanos.php">Agregar hermano/a</a></li>
                </ul>
              </li>
              <li><a href="#">Asistencias</a>
                <ul>
                  <li><a href="ver_asistencias.php">Ver lista de asistencia</a></li>
                  <li><a href="agregar_asistencia.php">Agregar asistencia</a></li>
                </ul>
              </li>
              <li><a href="#">Colegiaturas</a>
                <ul>
                  <li><a href="ver_pagos.php">Ver pagos</a></li>
                  <li><a href="agregar_pago.php">Agregar pago</a></li>
                </ul>
              </li>
              <li><a href="<?php session_destroy();?>">Cerrar sesion</a>
            </ul>
          </nav>
        </div>
      </div>
    </header>
