# language: pt

## Funcinalidade padrão de login

@login
Funcionalidade: Apenas usuário cadastrados podem se logar
  Usuário que estão cadastrados podem se logar, usuário sem acesso não conseguiram se logar

  @tag1
  Cenario: Um usuario valido consegue se logar
    Dado um usuario valido
    Quando tenta se logar
    Entao e redirecionado para a pagina logada
    
   Cenario: Um usuario invalido não consegue se logar
    Dado um usuario invalido
    Quando tenta se logar
    Entao continua na pagina de login
