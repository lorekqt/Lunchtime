# Lunchtime
DBServer pratical test

A implementação de um MVC, simples, porém funcional. Também o tratamento feito para que o restaurante não seja escolhido mais de uma vez por semana.


Para melhorar o sistema seria necessário integrar com algum banco de dados, dessa forma seria possivel implementar métodos que administram os votos semanalmente e oferecendo um momento correto para apresentar o resultado. Devido ao uso de dados fakes, logo após o usuário votar, ele já pode saber do resultado da votação. Também seria necessário retornar o estados dos restaurantes no fim de toda semana, para que eles pudessem ser eleitos novamente.

Ainda assim, a classe "Funcionario/Employee" foi abstraida, por não ter um ambiente a disposição para a validação de usuário, ou inclusive na rede da Empresa.

Também gostaria de ressaltar que o uso do swing foi pontual, para tornar um pouco mais ágil o desenvolvimento dessa aplicação visto a simplicidade que o Swing oferece.
