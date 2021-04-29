INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('fabianmu92','$2a$10$lPMR0RZnSrgz1w09rlTMae/yja.ebxD.R8vE853nEN0H4PEbfass2',1,'Fabian','Muñoz', 'fabianmu92@hotail.com');
INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('dianap2021','$2a$10$JFzuIFxIfKGTG3im1U1.OOCVXxaLR349sHZtbX.DXd504qCJ0wYyy',1,'Diana','Perez', 'dianap2021@hotail.com');


INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (1,2);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (2,1);
