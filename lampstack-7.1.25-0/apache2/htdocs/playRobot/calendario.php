<?php include_once'includes/templates/header.php'; ?>
    <main>
<div class="login">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="assets/dateTimePicker.css">
  </head>
  <h2>elegir fecha</h2>
  <br></br>
  <body>
    <div class="container">
      <div class="row">
        <div class="col-xss-4">
          <div id="basic" data-toggle="calendar"></div>
        </div>
      </div>


  </div>
    <script type="text/javascript" src="scripts/components/jquery.min.js"></script>
    <script type="text/javascript" src="scripts/dateTimePicker.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function()
    {
      $('#basic').calendar();
      $('#glob-data').calendar(
      {
        unavailable: ['*-*-8', '*-*-10']
      });
      $('#custom-first-day').calendar(
      {
        day_first: 2,
        unavailable: ['2014-07-10'],
        onSelectDate: function(date, month, year)
        {
          alert([year, month, date].join('-') + ' is: ' + this.isAvailable(date, month, year));
        }
      });
      $('#dynamic-data').calendar(
      {
        adapter: 'server/adapter.php'
      });
      $('#show-next-month').calendar(
      {
        num_next_month: 1,
        num_prev_month: 1,
        unavailable: ['*-*-9', '*-*-10']
      });
    });
    </script>
</div>
    </main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
