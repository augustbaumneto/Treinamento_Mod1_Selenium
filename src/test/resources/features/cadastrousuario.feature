# language: pt

## Funcionalidade para cadastrar usuario

@cadastro
Funcionalidade: Cadastro de usuario no site caso não exista login para o mesmo ainda
  Criação de usuarios

  @cadastrook
  Cenario: Cadastrar um usuario com dados validos
    Dado que estou no site automation testing
    E não existe usuario logado
    Quando acesso a opção my account
    E digito email e senha válidos
    E clico em Register
    Entao deve ser exiba uma mensagem informando que estou logado
    E deve-se permanecer na mesma pagina my account
