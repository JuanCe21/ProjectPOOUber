<?php

require_once('Car.php');
require_once('Account.php');
require_once("uberX.php");
require_once("uberPool.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->PrintDataCar();

$uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "ANDA765"), "Dodge", "Charger");
$uberPool->PrintDataCar();
?>