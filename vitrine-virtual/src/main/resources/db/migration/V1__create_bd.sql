CREATE TABLE IF NOT EXISTS categoria (
	id_categoria integer not null auto_increment primary key,
	nome_categoria varchar(100) not null
);

CREATE TABLE IF NOT EXISTS marca(
	id_marca integer not null auto_increment primary key,
	nome_marca varchar(100) not null,
	imagem_categoria varchar(255)
);

CREATE TABLE IF NOT EXISTS produto(
	id_produto integer not null auto_increment primary key,
	nome_produto varchar(100) not null,
	modelo_produto varchar(100) not null,
	descricao_produto varchar(255),
	preco_produto decimal not null,
	estoque_produto integer not null,
	id_marca integer not null,
	id_categoria integer not null,

	CONSTRAINT fk_p_marca FOREIGN KEY (id_marca) REFERENCES marca(id_marca),
	CONSTRAINT fk_p_categoria FOREIGN KEY (id_categoria) REFERENCES 	categoria(id_categoria)
);

CREATE TABLE IF NOT EXISTS marca_categoria(
	id_possui_marca integer not null auto_increment primary key,
	id_categoria integer not null,
	id_marca integer not null,

	CONSTRAINT fk_categoria FOREIGN KEY (id_categoria) REFERENCES 	categoria(id_categoria),
	CONSTRAINT fk_marca FOREIGN KEY (id_marca) REFERENCES marca(id_marca)
);