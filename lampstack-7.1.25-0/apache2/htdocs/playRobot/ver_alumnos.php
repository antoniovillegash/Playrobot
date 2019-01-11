<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <h2>Ver alumnos</h2>
    <br></br>
  <?php
    try{
      require_once('includes/funciones/bd_conexion.php');
      $sql=" SELECT id_alumno, nombre_alumno, apellido_alumno, nombre_nivel ";
      $sql.=" FROM lista ";
      $sql.=" INNER JOIN nivel ";
      $sql.=" ON lista.id_nivel = nivel.id_nivel ";
      $sql.=" ORDER BY nombre_nivel ASC, id_alumno ASC";
      $resultado=$conn->query($sql);
    }catch(Exception $e){
    echo $e->getMessage();
    }
  ?>

  <div class="resultados-bd" >

    <?php
     while($lista = $resultado->fetch_assoc()){
       ?>

        <br></br>
        <?php  $id_alumno=$lista['id_alumno'];?>
        <a href="alumno.php?id_alumno=<?php echo $lista['id_alumno']  ?>">
          <nav class="resultados-bd">
            <ul>
              <li>
                  <?php echo $lista['id_alumno'];

                    ?>
              </li>
              <li>
                  <?php echo $lista['nombre_nivel']; ?>
              </li>
              <li>
                <?php echo $lista['nombre_alumno'].(' ').$lista['apellido_alumno']; ?>
            </li>
          <form class="alumno" action="index.html" method="post">
            <div class="editar">
              <label></label>

              <input type="submit" name="editar" class="boton-edit" value="editar">
            </div>
          </form>


            </ul>

          </nav>
          </a>
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
