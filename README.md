Projeto de Media Player com Java
O projeto consiste em desenvolver um tocador de MP3 utilizando a biblioteca JavaFX, capaz de reproduzir arquivos de áudio. Os alunos irão utilizar os conceitos aprendidos na disciplina de LP-II, tais como:

Organização de pacotes
Interface gráfica (GUI)
Utilização de bibliotecas externas
Documentação JavaDOC
Herança
Polimorfismo
Classe Abstrata
Interfaces
Tratamento de Exceções
Requisitos do Projeto
O tocador de áudio deve possuir uma interface gráfica amigável. O sistema deve fornecer um sistema de login para os usuários, diferenciando níveis entre eles.

Controle de Acesso
Todos os usuários precisarão fazer login no sistema. Caso não possuam uma conta, será disponibilizada a opção de cadastro com dois tipos de usuários:

Usuários "VIP" podem criar várias playlists personalizadas.
Usuários comuns podem apenas adicionar e reproduzir músicas.
O Player deve iniciar a aplicação.

Usuário comum
O usuário comum pode adicionar diretórios para que o player exiba as músicas.
Usuário VIP
O usuário VIP terá a possibilidade de criar e gerenciar uma ou mais playlists personalizadas.
É importante destacar que após o usuário adicionar diretórios de músicas ao player, a lista de músicas deve ser mantida mesmo que o usuário feche o player. As músicas devem continuar listadas quando o usuário fizer um novo login.

Salvando os dados da aplicação
Para manter os dados da aplicação salvos, utilizaremos arquivos de texto que podem ter a extensão *.txt ou qualquer uma que o desenvolvedor preferir. Os arquivos serão manipulados de modo a salvar e recuperar os dados corretamente.

diretorios.txt: Este arquivo será responsável por armazenar as pastas que serão lidas quando o software for iniciado. Cada linha do arquivo representa uma pasta. O arquivo deve ser lido sempre que o player for aberto e deve ser alterado quando o usuário desejar adicionar mais pastas. No primeiro acesso ao player, não existirão pastas cadastradas e, consequentemente, não haverá lista de músicas.

musicas.txt: Este arquivo salvará apenas o nome das músicas e seus respectivos caminhos completos. Cada linha do arquivo representa o caminho completo para uma música.

playlist_xxx.txt: Haverá mais de um arquivo como este, um para cada playlist. Os arquivos de playlists serão privados para cada usuário VIP, que poderá criar e editar suas próprias playlists. Os arquivos devem começar com a autenticação do usuário (nome e ID).

usuarios.txt: Este arquivo será responsável por armazenar os dados dos usuários. Durante a inicialização, o software carregará os usuários para a memória e poderá fazer a autenticação.

Menu de Playlists
Os usuários VIPs poderão cadastrar músicas em uma playlist. Cada playlist terá um nome, e cada usuário VIP poderá ter mais de uma playlist. A forma como a playlist será montada pode ser decidida pelo programador, podendo ser por arrastar e soltar de uma lista para outra, abrindo diretórios e selecionando arquivos, etc. A adição de músicas pode ser feita de qualquer maneira conveniente.
