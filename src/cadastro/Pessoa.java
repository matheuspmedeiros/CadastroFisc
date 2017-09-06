package cadastro;
		import java.awt.Container;
		import javax.swing.JFrame;
		import javax.swing.JTextField;
		import javax.swing.JButton;
		import cadastro.Pessoa;
		import javax.swing.JLabel;
		
		
public class Pessoa extends JFrame {
	
	//caixa de texto
	JTextField txtNome = new JTextField();
	JTextField txtEnde = new JTextField();
	JTextField txtBairro = new JTextField();
	JTextField txtCep = new JTextField();	
	JTextField txtCidade = new JTextField();
	JTextField txtEstado = new JTextField();
	JTextField txtTelefone = new JTextField();
	JTextField txtCelular = new JTextField();
	JTextField txtRg = new JTextField();
	JTextField txtCpf = new JTextField();
	
	//label
	JLabel lblInt = new JLabel ("Cadastro de Pessoa Fisica");
	JLabel lblNome = new JLabel ("Nome :");
	JLabel lblEnde = new JLabel ("Endereço :");
	JLabel lblBairro = new JLabel ("Bairro :");
	JLabel lblCep = new JLabel ("CEP :");
	JLabel lblCidade = new JLabel ("Cidade :");
	JLabel lblEstado = new JLabel ("Estado :");
	JLabel lblTelefone = new JLabel ("Telefone :");
	JLabel lblCelular = new JLabel ("Celular :");
	JLabel lblRg = new JLabel ("RG :");
	JLabel lblCpf = new JLabel ("CPF :");
	
	
	//botão
	//JButton btnLimpar = new JButton ("Limpar");
	
	public Pessoa (){
		
		super("Cadatro Pessoa Fisica");
		Container paine = this.getContentPane();
		
		//introdução
			paine.add(lblInt);
			lblInt.setBounds(120, 20, 200, 25);
		
		
		
		//Nome do cadastrado  
			paine.add(lblNome);
			lblNome.setBounds(20, 60, 65, 25);
			
			paine.add(txtNome);
			txtNome.setBounds(100, 60, 200, 25);
		
		//Endereco do cadastrado
			paine.add(lblEnde);
			lblEnde.setBounds(20, 100, 65, 25);
			
			paine.add(txtEnde);
			txtEnde.setBounds(100, 100, 200, 25);
		
		//Bairro do cadastrado 
			paine.add(lblBairro);
			lblBairro.setBounds(20, 140, 65, 25);
			
			paine.add(txtBairro);
			txtBairro.setBounds(100, 140, 200, 25);
		
		//cep do cadastrado 
			paine.add(lblCep);
			lblCep.setBounds(20, 180, 65, 25);
					
			paine.add(txtCep);
			txtCep.setBounds(100, 180, 200, 25);
				
		//cidade do cadastrado 
			paine.add(lblCidade);
			lblCidade.setBounds(20, 220, 65, 25);
			
			paine.add(txtCidade);
			txtCidade.setBounds(100, 220, 200, 25);
		
		//estado do cadastrado 
			paine.add(lblEstado);
			lblEstado.setBounds(20, 260, 65, 25);
			
			paine.add(txtEstado);
			txtEstado.setBounds(100, 260, 200, 25);	
		
		//Telefone do cadastrado 
			paine.add(lblTelefone);
			lblTelefone.setBounds(20, 300, 65, 25);
			
			paine.add(txtTelefone);
			txtTelefone.setBounds(100, 300, 200, 25);
			
		//Celuar do cadastrado 
			paine.add(lblCelular);
			lblCelular.setBounds(20, 340, 65, 25);
			
			paine.add(txtCelular);
			txtCelular.setBounds(100, 340, 200, 25);
			
		//Rg do cadastrado 
			paine.add(lblRg);
			lblRg.setBounds(20, 380, 65, 25);
			
			paine.add(txtRg);
			txtRg.setBounds(100, 380, 200, 25);
			
		//Cpf do cadastrado 
			paine.add(lblCpf);
			lblCpf.setBounds(20, 420, 65, 25);
			
			paine.add(txtCpf);
			txtCpf.setBounds(100, 420, 200, 25);
			
		
		paine.setLayout(null); // posicionamento dos objetos do layout
		this.setSize(390,560); // tamanho da tela
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main (String[] args){
		Pessoa pes = new Pessoa();
	}
}
