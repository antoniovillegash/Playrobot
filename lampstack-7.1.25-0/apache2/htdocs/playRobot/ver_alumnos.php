<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <h2>Ver alumnos</h2>
  <?php
    try{
      require_once('includes/funciones/bd_conexion.php');
      $sql=" SELECT id_alumno, nombre_alumno, apellido_alumno, nombre_nivel ";
      $sql.=" FROM lista ";
      $sql.=" INNER JOIN nivel ";
      $sql.=" ON lista.id_nivel = nivel.id_nivel ";
      $resultado=$conn->query($sql);
    }catch(Exception $e){
    echo $e->getMessage();
    }
  ?>
  <div class="resultados-bd">
    <?php
     while($lista = $resultado->fetch_assoc()){
       ?>
       <pre>
         <?php echo  ?> 
       </pre>
       <?php
     }
    ?>

  </div>
  <?php
    $conn->close();
  ?>
</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
