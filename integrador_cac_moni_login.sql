use integrador_cac_moni;
CREATE TABLE login (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(50) NOT NULL,
    contraseña VARCHAR(255) NOT NULL
);
INSERT INTO login (usuario, contraseña) VALUES ('admin', 'admin');
select * from login;