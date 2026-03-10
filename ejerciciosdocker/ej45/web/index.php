<?php
$conexion = new mysqli("db", "root", "1234", "app_db");
if ($conexion->connect_error) {
die("n Error de conexión: " . $conexion->connect_error);
}
