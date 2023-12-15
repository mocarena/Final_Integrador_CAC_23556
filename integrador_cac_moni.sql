create database integrador_cac_moni;
use integrador_cac_moni;
CREATE TABLE oradores (
  id_orador INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255),
  apellido VARCHAR(255),
  tema VARCHAR(255),
  fecha_alta date
);
SELECT 
    *
FROM
    oradores;