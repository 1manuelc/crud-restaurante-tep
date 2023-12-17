package com.restaurante.tep.model.queries;

public class ConsultasSQL {
    public static final String INSERIR_FUNCIONARIO =
            "INSERT INTO tbFuncionario\n" +
            "       (Email,     Senha,  Nome,   CPF,    Endereco,   Telefone)\n" +
            "VALUES (?,         ?,      ?,      ?,      ?,          ?);";

    public static final String OBTER_FUNCIONARIOS = "SELECT * FROM tbFuncionario";

    public static final String OBTER_FUNCIONARIO_POR_ID =
            "SELECT * FROM tbFuncionario\n" +
            "WHERE IdFun = ?";

    public static final String ATUALIZAR_FUNCIONARIO_POR_ID =
            "UPDATE tbFuncionario\n" +
            "SET\n" +
                "Email = ?, Senha = ?, Nome = ?,\n" +
                "CPF = ?, Endereco = ?, Telefone = ?\n" +
            "WHERE IdFun = ?;";

    public static final String DELETAR_FUNCIONARIO_POR_ID =
            "DELETE FROM tbFuncionario\n" +
            "WHERE IdFun = ?";
    
    public static final String VERIFICAR_EXISTENCIA_INSERCOES =
        "SHOW TABLES LIKE 'tbCardapio'";
    
    public static final String[] POVOAR_BANCO_PADRAO =
    {
        "CREATE TABLE tbFuncionario(\n" +
        "    IdFun int(2) not null auto_increment,\n" +
        "    Email varchar(50) not null,\n" +
        "    Senha varchar(8) not null,\n" +
        "    Nome varchar(50) not null,\n" +
        "    CPF varchar(14) not null,\n" +
        "    Endereco varchar(150) not null,\n" +
        "    Telefone varchar(14) not null,\n" +
        "\n" +
        "    primary key(IdFun)\n" +
        ");"
            
    ,

        "CREATE TABLE tbMesa(\n" +
        "    idMesa int(2) not null auto_increment,\n" +
        "    NumeroMesa int(3) not null,\n" +
        "    Capacidade int(2) not null,\n" +
        "    Ativa int(1) not null,\n" +
        "\n" +
        "    primary key (idMesa)\n" +
        ");"
    ,

        "CREATE TABLE tbPedidos(\n" +
        "    IdPedido int(5) not null auto_increment,\n" +
        "    DataPedido date not null,\n" +
        "    IdFun int(5) not null,\n" +
        "    IdMesa int(5) not null,\n" +
        "    Ativo int(1) not null,\n" +
        "\n" +
        "    foreign key (IdFun) references tbFuncionario(IdFun),\n" +
        "    foreign key (IdMesa) references tbMesa(idMesa),\n" +
        "\n" +
        "    primary key (IdPedido)\n" +
        ");"
            
    ,

        "CREATE TABLE tbCategoria(\n" +
        "    IdCategoria int(2) not null auto_increment,\n" +
        "    Descricao varchar(25) not null,\n" +
        "\n" +
        "    primary key (IdCategoria)\n" +
        ");"
            
    ,

        "CREATE TABLE tbCardapio(\n" +
        "    IdItemCardapio int(3) not null auto_increment,\n" +
        "    IdCategoria int(5) not null,\n" +
        "    Nome varchar(100) not null,\n" +
        "    Descricao varchar(150) not null,\n" +
        "    Preco decimal(10,2) not null,\n" +
        "    Ativo int(1) not null,\n" +
        "\n" +
        "    foreign key(IdCategoria) references tbCategoria(IdCategoria),\n" +
        "\n" +
        "    primary key (IdItemCardapio)\n" +
        ");"
            
    ,

        "CREATE TABLE tbDetalhesPed(\n" +
        "    IdDetalhesPed int(5) not null auto_increment,\n" +
        "    IdPedido int(5) not null,\n" +
        "    IdItemCardapio int(5) not null,\n" +
        "    Quantidade int not null,\n" +
        "    Total decimal(10,2) not null,\n" +
        "    Desconto decimal(10,2) not null,\n" +
        "\n" +
        "    foreign key (IdPedido) references tbPedidos(IdPedido),\n" +
        "    foreign key (IdItemCardapio) references tbCardapio(idItemCardapio),\n" +
        "    \n" +
        "    primary key (IdDetalhesPed)\n" +
        ");"
            
    ,

        "INSERT INTO tbCategoria (Descricao) VALUES\n" +
        "('Entradas'),\n" +
        "('Executivos'),\n" +
        "('Pratos Principais'),\n" +
        "('Sobremesas'),\n" +
        "('Sucos'),\n" +
        "('Bebidas Alcoólicas'),\n" +
        "('Refrigerantes e Água');\n" +
        "\n" +
        "\n" +
        "INSERT INTO tbCardapio\n" +
        "(IdCategoria,   Nome,                               Descricao,                              Preco,  Ativo)\n" +
        "VALUES\n" +
        "(1,             'Frango a passarinho',              'Porção de frango frito temperado',     30.99,  1),\n" +
        "(1,             'Bolinha de queijo a milanesa',     'Bolinhas de queijo fritas empanadas',  31.99,  1),\n" +
        "(1,             'Nugget de frango',                 'Porção de nuggets de frango',          31.99,  1),\n" +
        "(1,             'Camarão ao alho e óleo',           'Camarões preparados com alho e óleo',  37.99,  1),\n" +
        "(1,             'Batata frita',                     'Porção de batatas fritas',             19.99,  1),\n" +
        "(1,             'Linguiça calabresa',               'Porção de linguiça calabresa',         18.99,  1),\n" +
        "(1,             'Aipim frito - macaxeira',          'Porção de aipim (macaxeira) frito',    19.99,  1);\n" +
        "\n" +
        "\n" +
        "INSERT INTO tbCardapio\n" +
        "(IdCategoria,   Nome,                                               Descricao,                                      Preco,  Ativo)\n" +
        "VALUES\n" +
        "(2,             'Exec Filé mignon à parmegiana ao molho vermelho',  'Filé mignon à parmegiana com molho vermelho',  34.99,  1),\n" +
        "(2,             'Exec Filé de peixe à parmegiana ao molho branco',  'Filé de peixe à parmegiana com molho branco',  31.99,  1),\n" +
        "(2,             'Exec filé de frango à parmegiana ao molho branco', 'Filé de frango à parmegiana com molho branco', 31.99,  1),\n" +
        "(2,             'Exec churrasco contra filé na brasa',              'Churrasco de contra filé na brasa',            28.99,  1),\n" +
        "(2,             'Exec churrasco carne suína na brasa',              'Churrasco de carne suína na brasa',            26.99,  1),\n" +
        "(2,             'Exec Rondelli carne de sol ao molho',              'Rondelli de carne de sol ao molho',            29.99,  1),\n" +
        "(2,             'Exec Fettuccine à bolonhesa',                      'Fettuccine à bolonhesa',                       29.99,  1);\n" +
        "\n" +
        "\n" +
        "INSERT INTO tbCardapio\n" +
        "(IdCategoria,   Nome,                                       Descricao,                                  Preco,  Ativo)\n" +
        "VALUES\n" +
        "(3,             'Filé de salmão grelhado ao belle meunire', 'Filé de salmão grelhado ao belle meunire', 110.00, 1),\n" +
        "(3,             'Picanha importada',                        'Picanha importada grelhada',               99.99,  1),\n" +
        "(3,             'Churrasco misto',                          'Churrasco misto de carnes',                104.00, 1),\n" +
        "(3,             'Filé de frango grelhado',                  'Filé de frango grelhado',                  62.99,  1),\n" +
        "(3,             'Filé mignon à parmegiana',                 'Filé mignon à parmegiana',                 94.99,  1),\n" +
        "(3,             'Medalhão filé mignon',                     'Medalhão de filé mignon',                  110.00, 1),\n" +
        "(3,             'Costela suína',                            'Costela suína grelhada',                   71.99,  1),\n" +
        "(3,             'Filé mignon ao molho madeira',             'Filé mignon ao molho madeira',             115.99, 1),\n" +
        "(3,             'Espaguete à bolonhesa',                    'Espaguete à bolonhesa',                    64.99,  1);\n" +
        "\n" +
        "\n" +
        "INSERT INTO tbCardapio\n" +
        "(IdCategoria,   Nome,                       Descricao,                                                  Preco,  Ativo)\n" +
        "VALUES\n" +
        "(4,             'Pudim de Leite',           'Delicioso pudim de leite condensado',                      15.99,  1),\n" +
        "(4,             'Torta de Chocolate',       'Torta cremosa de chocolate com cobertura',                 20.99,  1),\n" +
        "(4,             'Mousse de Maracujá',       'Mousse leve e refrescante de maracujá',                    18.99,  1),\n" +
        "(4,             'Cheesecake de Morango',    'Cheesecake com cobertura de morango',                      22.99,  1),\n" +
        "(4,             'Brownie com Sorvete',      'Brownie quente com sorvete de baunilha',                   25.99,  1),\n" +
        "(4,             'Banana Split',             'Banana dividida com sorvete, calda e chantilly',           21.99,  1),\n" +
        "(4,             'Tiramisu',                 'Clássico italiano com camadas de café e mascarpone',       26.99,  1),\n" +
        "(4,             'Pavê de Morango',          'Pavê com camadas de morango e creme',                      19.99,  1),\n" +
        "(4,             'Creme Brûlée',             'Creme de baunilha com açúcar caramelizado',                23.99,  1),\n" +
        "(4,             'Sorvete Sundae',           'Sorvete com cobertura de chocolate, amendoim e chantilly', 17.99,  1);\n" +
        "\n" +
        "\n" +
        "INSERT INTO tbCardapio\n" +
        "(IdCategoria,   Nome,                           Descricao,                                  Preco,  Ativo)\n" +
        "VALUES\n" +
        "(5,             'Suco de Pêssego',              'Suco natural de pêssego',                  8.99,   1),\n" +
        "(5,             'Suco de Caju',                 'Suco refrescante de caju',                 8.99,   1),\n" +
        "(5,             'Suco de Kiwi',                 'Suco natural de kiwi',                     9.99,   1),\n" +
        "(5,             'Suco de Melancia',             'Suco de melancia gelado',                  7.99,   1),\n" +
        "(5,             'Suco Verde',                   'Suco detox com vegetais verdes',           10.99,  1),\n" +
        "(5,             'Suco de Maçã',                 'Suco natural de maçã',                     7.99,   1),\n" +
        "(5,             'Suco de Acerola',              'Suco rico em vitamina C',                  9.99,   1),\n" +
        "(5,             'Suco de Mamão',                'Suco natural de mamão',                    8.99,   1),\n" +
        "(5,             'Suco de Framboesa',            'Suco de framboesa com gelo',               10.99,  1),\n" +
        "(5,             'Suco de Maracujá com Hortelã', 'Suco de maracujá com toque de hortelã',    9.99,   1);\n" +
        "\n" +
        "\n" +
        "INSERT INTO tbCardapio\n" +
        "(IdCategoria,   Nome,                               Descricao,                                                          Preco,  Ativo)\n" +
        "VALUES\n" +
        "(6,             'Piña Colada',                      'Coquetel de abacaxi, coco e rum',                                  20.99,  1),\n" +
        "(6,             'Daiquiri de Morango',              'Coquetel de morango com rum e suco de limão',                      18.99,  1),\n" +
        "(6,             'Mojito',                           'Coquetel cubano com hortelã, limão, açúcar, rum e água com gás',   22.99,  1),\n" +
        "(6,             'Whisky Sour',                      'Whisky, açúcar, suco de limão e clara de ovo',                     25.99,  1),\n" +
        "(6,             'Negroni',                          'Gin, vermute tinto e Campari',                                     23.99,  1),\n" +
        "(6,             'Mai Tai',                          'Coquetel tropical com rum, licor de amêndoa e suco de limão',      24.99,  1),\n" +
        "(6,             'Moscow Mule',                      'Vodka, ginger beer e suco de limão',                               21.99,  1),\n" +
        "(6,             'Caipiroska de Frutas Vermelhas',   'Vodka, frutas vermelhas, açúcar e gelo',                           19.99,  1),\n" +
        "(6,             'Tequila Sunrise',                  'Tequila, suco de laranja e grenadine',                             18.99,  1),\n" +
        "(6,             'Aperol Spritz',                    'Aperol, espumante e água com gás',                                 22.99,  1);\n" +
        "\n" +
        "\n" +
        "INSERT INTO tbCardapio\n" +
        "(IdCategoria,   Nome,                               Descricao,                              Preco,  Ativo)\n" +
        "VALUES\n" +
        "(7,             'Refrigerante Coca-Cola',           'Refrigerante Coca-Cola tradicional',   5.99,   1),\n" +
        "(7,             'Refrigerante Pepsi',               'Refrigerante Pepsi',                   5.99,   1),\n" +
        "(7,             'Refrigerante Guaraná Antarctica',  'Guaraná Antarctica',                   5.99,   1),\n" +
        "(7,             'Refrigerante Sprite',              'Refrigerante Sprite',                  5.99,   1),\n" +
        "(7,             'Refrigerante Fanta Laranja',       'Refrigerante Fanta sabor laranja',     5.99,   1),\n" +
        "(7,             'Refrigerante Kuat',                'Refrigerante Kuat',                    5.99,   1),\n" +
        "(7,             'Refrigerante Antarctica Original', 'Refrigerante Antarctica Original',     5.99,   1),\n" +
        "(7,             'Refrigerante Sukita',              'Refrigerante Sukita',                  5.99,   1),\n" +
        "(7,             'Refrigerante Guarah',              'Refrigerante Guarah',                  5.99,   1),\n" +
        "(7,             'Água com Gás',                     'Água mineral com gás',                 4.99,   1);\n" +
        "\n" +
        "\n" +
        "INSERT INTO tbMesa\n" +
        "(NumeroMesa,    Capacidade, Ativa)\n" +
        "VALUES\n" +
        "(1,             4,          1),\n" +
        "(2,             2,          1),\n" +
        "(3,             8,          1),\n" +
        "(4,             4,          1),\n" +
        "(5,             2,          1);\n" +
        "\n" +
        "INSERT INTO tbFuncionario\n" +
        "(Email,                 Senha,      Nome,                       CPF,                Endereco,                                       Telefone)\n" +
        "VALUES\n" +
        "('gerente@ginefood.com','12345678', 'Jorge Djavan Faglioni',    '000.000.000-00',   'Rua Terra do Nunca, Maravilha, 21, 00000-000', '(00)90000-0000');"
    };
}
