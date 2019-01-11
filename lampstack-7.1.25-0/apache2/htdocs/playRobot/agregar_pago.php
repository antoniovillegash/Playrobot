<?php include_once'includes/templates/header.php'; ?>
    <main class="registro">
      <h2>Agregar pago</h2>
      <br></br>
      <section id="contacto" class="contacto">
        <form action="validar_pago.php" method="post">
          <div class="contenedor-campos">
            <div class="campo w-100">
              <label>Alumno:</label>
              <select class="campo" name="alumno" required>
                <?php
                  try{
                    require_once('includes/funciones/bd_conexion.php');
                    $sql=" SELECT referencia_de_pago, nombre_alumno, apellido_alumno ";
                    $sql.=" FROM lista ";
                    $resultado=$conn->query($sql);
                  }catch(Exception $e){
                  echo $e->getMessage();
                  }
                ?>
                <div class="resultados-bd">
                  <?php
                    while ( $row = $resultado->fetch_array()){
                  ?>
                  <option value=" <?php echo $row['referencia_de_pago'] ?> " >
                  <?php echo $row['nombre_alumno'].(' ').$row['apellido_alumno']; ?>
                     <?php
                   }
                  ?>

                </div>

              </select>
            </div>
            <div class="campo">
              <label>Concepto de pago:</label>
              <select class="campo" name="pago" required>
                <?php
                  try{
                    require_once('includes/funciones/bd_conexion.php');
                    $sql=" SELECT id_pago, nombre_pago";
                    $sql.=" FROM tipo_de_pago ";
                    $resultado=$conn->query($sql);
                  }catch(Exception $e){
                  echo $e->getMessage();
                  }
                ?>
                <div class="resultados-bd">
                  <?php
                    while ( $row = $resultado->fetch_array()){
                  ?>
                  <option value=" <?php echo $row['id_pago'] ?> " >
                  <?php echo $row['nombre_pago']; ?>
                     <?php
                   }
                  ?>

                </div>
                <?php
                  $conn->close();
                ?>
              </select>
            </div>
            <div class="campo w-100">
              <label>Cantidad:</label>
              <input type="text" name="cantidad" required>
            </div>
            <div class="campo">
              <label>Descuento:</label>
              <input type="text" name="descuento" required>
            </div>
            <div class="campo">
              <label>Fecha de pago:</label>
              <input type="date" name="fecha_de_pago" required>
            </div>
          </div>
          <div class="enviar">
            <label></label>
            <input type="submit" name="submit" class="boton" value="Registrar">
          </div>
        </form>
      </section>
    </main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
