INSERT INTO clientes (identificador, nombre, correo) VALUES ('145657876-4','juan perez saez','juan.prez@gmail.com');
INSERT INTO clientes (identificador, nombre, correo) VALUES ('123232323-5','cristian perez aguila','adcdae@gmail.com');
INSERT INTO clientes (identificador, nombre, correo) VALUES ('134232233-K','ana gutierrez pinilla','ana@gmail.com');
INSERT INTO clientes (identificador, nombre, correo) VALUES ('543434333-0','francisco sepulveda','jfsepu@gmail.com');
INSERT INTO clientes (identificador, nombre, correo) VALUES ('454454454-K','hector soto pinilla','hsp@gmail.com');
INSERT INTO clientes (identificador, nombre, correo) VALUES ('344578963-4','oscar cordero herrera','c@gmail.com');

INSERT INTO deudas (identificador, cliente_identificador, fecha_vencimiento, monto) VALUES ('zbc1233','145657876-4',TO_DATE('12-03-2021','dd-MM-yyyy'),1900);
INSERT INTO deudas (identificador, cliente_identificador, fecha_vencimiento, monto) VALUES ('123123123','123232323-5',TO_DATE('12-03-2021','dd-MM-yyyy'),23456);
INSERT INTO deudas (identificador, cliente_identificador, fecha_vencimiento, monto) VALUES ('3232323','134232233-K',TO_DATE('12-03-2021','dd-MM-yyyy'),3232323);
INSERT INTO deudas (identificador, cliente_identificador, fecha_vencimiento, monto) VALUES ('aa23232','543434333-0',TO_DATE('11-03-2021','dd-MM-yyyy'),130000);       
INSERT INTO deudas (identificador, cliente_identificador, fecha_vencimiento, monto) VALUES ('sddsds','454454454-K',TO_DATE('12-03-2021','dd-MM-yyyy'),54333);
INSERT INTO deudas (identificador, cliente_identificador, fecha_vencimiento, monto) VALUES ('a123123','344578963-4',TO_DATE('11-02-2021','dd-MM-yyyy'),1200);