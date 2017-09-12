package cadastro;
		import java.awt.Container;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import javax.swing.ButtonGroup;
		import javax.swing.JFrame;
		import javax.swing.JTextField;
		import javax.swing.JButton;
import javax.swing.JComboBox;

import cadastro.Pessoa;
		import javax.swing.JLabel;
		import javax.swing.JRadioButton;
		
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
	JButton btnLimpar = new JButton ("Limpar");
	JButton btnEnviar = new JButton ("Enviar");
	
	//sexo
	JRadioButton rdnSexom = new JRadioButton ("Masculino") ;
	JRadioButton rdnSexof = new JRadioButton ("Feminino");
	ButtonGroup  grupo = new ButtonGroup ();
	
	//Estado
	JComboBox cboEsta = new JComboBox();
	
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
			
			paine.add(cboEsta);
			cboEsta.setBounds(100, 260, 120, 25);
			
			//estados no cbo
			cboEsta.addItem("Acre");
			cboEsta.addItem("Alagoas");
			cboEsta.addItem("Amapa");
			cboEsta.addItem("Amazonas");
			cboEsta.addItem("Bahia");
			cboEsta.addItem("Ceará");
			cboEsta.addItem("Distrito Federal");
			cboEsta.addItem("Espirito Santo");
			cboEsta.addItem("Goiás");
			cboEsta.addItem("Maranhão");
			cboEsta.addItem("Mato Grosso");
			cboEsta.addItem("Mato Grosso do Sul");
			cboEsta.addItem("Minas Gerais");
			cboEsta.addItem("Pará");
			cboEsta.addItem("Paraíba");
			cboEsta.addItem("Paraná");
			cboEsta.addItem("Pernambuco");
			cboEsta.addItem("Piauí");
			cboEsta.addItem("Rio de Janeiro");
			cboEsta.addItem("Rio Grande do Norte");
			cboEsta.addItem("Rio Grande do Sul");
			cboEsta.addItem("Rondônia");
			cboEsta.addItem("Santa Catarina");
			cboEsta.addItem("São Paulo");
			cboEsta.addItem("Sergipe");
			cboEsta.addItem("Tocantins");
			
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
			
		//rnd do sexo 
			
			grupo.add(rdnSexom);
			grupo.add(rdnSexof);
			
			paine.add(rdnSexom);
			rdnSexom.setBounds(20, 460, 100, 25);
			
			paine.add(rdnSexof);
			rdnSexof.setBounds(120, 460, 80, 25);
			
		//btn limpar
			paine.add(btnLimpar);
			btnLimpar.setBounds(180, 500, 80, 25);
			btnLimpar.addActionListener(new ActionListener() {
				@Override 
					public void actionPerformed(ActionEvent e){
						txtNome.setText("");
						txtEnde.setText("");
						txtBairro.setText("");
						txtCep.setText("");
						txtCidade.setText("");
						txtTelefone.setText("");
						txtCelular.setText("");
						txtRg.setText("");
						txtCpf.setText("");
					}
				});
			//btn Enviar
				paine.add(btnEnviar);
				btnEnviar.setBounds(60, 500, 80, 25);
			
		
		paine.setLayout(null); // posicionamento dos objetos do layout
		this.setSize(350,600); // tamanho da tela
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main (String[] args){
		Pessoa pes = new Pessoa();
	}
}
