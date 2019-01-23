<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <?php
    date_default_timezone_set('America/Mexico_City');
    $id_mes=date(m);
    $id_year=date(Y);
    $id_year_month=$id_year.('-').$id_mes;
  switch($id_mes){
case 1:
?><h2>Resumen de Enero</h2><?php
break;
case 2:
?><h2>Resumen de Febrero</h2><?php
break;
case 3:
?><h2>Resumen de Marzo</h2><?php
break;
case 4:
?><h2>Resumen de Abril</h2><?php
break;
case 5:
?><h2>Resumen de Mayo</h2><?php
break;
case 6:
?><h2>Resumen de Junio</h2><?php
break;
case 7:
?><h2>Resumen de Julio</h2><?php
break;
case 8:
?><h2>Resumen de Agosto</h2><?php
break;
case 9:
?><h2>Resumen de Septiembre</h2><?php
break;
case 10:
?><h2>Resumen de Octubre</h2><?php
break;
case 11:
?><h2>Resumen de Noviembre</h2><?php
break;
case 12:
?><h2>Resumen de Diciembre</h2><?php
break;
}?>
    <br></br>
  <?php


    try{
      require_once('includes/funciones/bd_conexion.php');
      $sql=" SELECT * ";
      $sql.=" FROM pagos ";
      $sql.= "LEFT JOIN tipo_de_pago ON pagos.id_tipo_de_pago=tipo_de_pago.id_pago ";
      $sql.=" LEFT JOIN pago_con ";
      $sql.=" ON pagos.metodo_de_pago = pago_con.id_pago_con ";
      $sql.=" LEFT JOIN lista ON pagos.referencia_de_pago = lista.referencia_de_pago ";
      $sql.=" ORDER BY pagos.id_pagos ASC ";
      $resultado=$conn->query($sql);
    }catch(Exception $e){
    echo $e->getMessage();
    }
  ?>

  <div class="resultados-bd" >

    <?php
      $id_pago=0;
      $pagos_tdc[0]=0;
      $pagos_debito[0]=0;
      $pagos_transferencia[0]=0;
      $pagos_cheque[0]=0;
      $pagos_efectivo[0]=0;
      $pagos_inscripcion[0]=0;
      $pagos_tdc[1]=0;
      $pagos_debito[1]=0;
      $pagos_transferencia[1]=0;
      $pagos_cheque[1]=0;
      $pagos_efectivo[1]=0;
      $pagos_inscripcion[1]=0;
      $pagos_total[0]=0;
      $pagos_total[1]=0;
     while($lista = $resultado->fetch_assoc()){
       ?>
      <?php

        $mes=substr($lista['fecha_de_pago'],0,-3);
        if($mes==$id_year_month):
        if($id_pago!=$lista['id_pagos']):
          switch ($lista['metodo_de_pago']) {
            case '1':
              $pagos_tdc[0]++;
              $pagos_tdc[1]+=$lista['cantidad'];
              break;
              case '2':
                $pagos_debito[0]++;
                $pagos_debito[1]+=$lista['cantidad'];
                break;
                case '3':
                  $pagos_transferencia[0]++;
                  $pagos_transferencia[1]+=$lista['cantidad'];
                  break;
                  case '4':
                    $pagos_cheque[0]++;
                    $pagos_cheque[1]+=$lista['cantidad'];
                    break;
                    case '5':
                      $pagos_efectivo[0]++;
                      $pagos_efectivo[1]+=$lista['cantidad'];
                      break;
            default:
              // code...
              break;
          }
          if($lista['id_tipo_de_pago']==13){
            $pagos_inscripcion[0]++;
            $pagos_inscripcion[1]+=$lista['cantidad'];
          }
          $pagos_total[0]++;
          $pagos_total[1]+=$lista['cantidad'];
          endif;
          endif;
          $id_pago=$lista['id_pagos'];?>
       <?php
     }

    ?>
    <h3 class="texto">
      <hr>
      <?php echo "pagos con tarjeta de crédito: ".$pagos_tdc[0]; ?>
      <br>
      <?php echo "total con tarjeta de crédito: "."$ ".$pagos_tdc[1]; ?>
      <br>
      <?php echo "pagos con cuenta de débito: ".$pagos_debito[0]; ?>
      <br>
      <?php echo "total con cuenta de débito: "."$ ".$pagos_debito[1]; ?>
      <br>
      <?php echo "pagos con transferencia: ".$pagos_transferencia[0]; ?>
      <br>
      <?php echo "total con transferencia: "."$ ".$pagos_transferencia[1]; ?>
      <br>
      <?php echo "pagos con cheque: ".$pagos_cheque[0]; ?>
      <br>
      <?php echo "total con cheque: "."$ ".$pagos_cheque[1]; ?>
      <br>
      <?php echo "pagos en efectivo: ".$pagos_efectivo[0]; ?>
      <br>
      <?php echo "total en efectivo: "."$ ".$pagos_efectivo[1]; ?>
      <br>
      <hr>
      <?php echo "pagos por inscripción: ".$pagos_inscripcion[0]; ?>
      <br>
      <?php echo "total inscripciones: "."$ ".$pagos_inscripcion[1]; ?>
      <br>
      <hr>
      <?php echo "cantidad de pagos: ".$pagos_total[0]; ?>
      <br><br><br>
      <?php echo "total: "."$ ".$pagos_total[1]; ?>
      <br>
      <hr>
    </h3>

  </div>

  <?php
    $conn->close();
  ?>
</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
