<?php session_start();
if (!isset($_SESSION['nombre_usuario'])) {
 header("location:login.php");
  die;
}

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
                <ul>
                  <li><a href="resumen_del_mes.php">Resumen del mes</a></li>
                </ul>
              <li><a href="ver_alumnos.php">Alumnos</a>
                <ul>
                  <li><a href="registro_de_alumno.php">Registrar alumno</a></li>
                  <li><a href="agregar_hermanos.php">Agregar hermano/a</a></li>
                </ul>
              </li>
              <li><a href="ver_asistencias.php">Asistencias</a>
                <ul>
                  <li><a href="agregar_asistencia.php">Agregar asistencia</a></li>
                </ul>
              </li>
              <li><a href="ver_pagos.php">Colegiaturas</a>
                <ul>
                  <li><a href="agregar_pago.php">Agregar pago</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=1">Enero</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=2">Febrero</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=3">Marzo</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=4">Abril</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=5">Mayo</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=6">Junio</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=7">Julio</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=8">Agosto</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=9">Septiembre</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=10">Octubre</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=11">Noviembre</a></li>
                  <li><a href="ver_pagos_del_mes.php?id_mes=12">Diciembre</a></li>

                </ul>
              </li>
              <li><a href="cerrar_sesion.php">Cerrar sesion</a>
            </ul>
          </nav>
        </div>
      </div>
    </header>
