#language: pt

  @cadastro
  Funcionalidade: Cadastrar novo usuário

    @cadastro_com_sucesso
    Cenário: Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuário
      Quando eu preencho o formulário de cadastro
      E clico em registrar
      Entao vejo cadastro realizado com sucesso




