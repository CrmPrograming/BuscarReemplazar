package dad.javafx.buscarreemplazar;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class Vista extends BorderPane {
	
	private Button btBuscar;
	private Button btReemplazar;
	private Button btReemplazarTodo;
	private Button btCerrar;
	private Button btAyuda;
	
	private TextField tfBuscar;
	private TextField tfReemplazar;
	
	private CheckBox cbMayus;
	private CheckBox cbBuscarAtras;
	private CheckBox cbExpresionRegular;
	private CheckBox cbResaltarResultados;
	
	public Vista() {
		super();
		
		// Botonera derecha
		btBuscar = new Button("Buscar");
		btReemplazar = new Button("Reemplazar");
		btReemplazarTodo = new Button("Reemplazar todo");
		btCerrar = new Button("Cerrar");
		btAyuda = new Button("Ayuda");
		
		btBuscar.setMaxWidth(Double.MAX_VALUE);
		btReemplazar.setMaxWidth(Double.MAX_VALUE);
		btReemplazarTodo.setMaxWidth(Double.MAX_VALUE);
		btCerrar.setMaxWidth(Double.MAX_VALUE);
		btAyuda.setMaxWidth(Double.MAX_VALUE);
		
		VBox este = new VBox();
		este.getChildren().addAll(btBuscar, btReemplazar, btReemplazarTodo, btCerrar, btAyuda);
		este.setSpacing(5);
		este.setPadding(new Insets(5, 10, 0, 10));
		
		// Cuerpo de la ventana
		
		GridPane centro = new GridPane();
		centro.setPadding(new Insets(5));
		centro.setHgap(5);
		centro.setVgap(5);
		
		Label lbBuscar = new Label("Buscar:");
		Label lbReemplazar = new Label("Reemplazar con:");
		
		tfBuscar = new TextField();
		tfReemplazar = new TextField();
		
		centro.addRow(0, lbBuscar, tfBuscar);
		centro.addRow(1, lbReemplazar, tfReemplazar);
		
		ColumnConstraints[] cols = {
			new ColumnConstraints(),
			new ColumnConstraints(),
		};
		
		cols[0].setHalignment(HPos.LEFT);
		
		// Marcamos el largo de los componentes a lo máximo posible
		centro.getColumnConstraints().setAll(cols);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);

		// Panel con Checkboxes
		
		cbMayus = new CheckBox();
		cbBuscarAtras = new CheckBox();
		cbExpresionRegular = new CheckBox();
		cbResaltarResultados = new CheckBox();
		
		GridPane pCheckbox = new GridPane();
		pCheckbox.setPadding(new Insets(5, 5, 0, 0));
		pCheckbox.setHgap(10);
		pCheckbox.setVgap(5);
		
		pCheckbox.addRow(0, cbMayus, new Label("Mayúsculas y minúsculas"), cbBuscarAtras, new Label("Buscar hacia atrás"));
		pCheckbox.addRow(1, cbExpresionRegular, new Label("Expresión regular"),	cbResaltarResultados, new Label("Resaltar resultados"));
		
		centro.add(pCheckbox, 1, 2);
		
		this.setRight(este);
		this.setCenter(centro);
	}

	public Button getBtBuscar() {
		return btBuscar;
	}

	public void setBtBuscar(Button btBuscar) {
		this.btBuscar = btBuscar;
	}

	public Button getBtReemplazar() {
		return btReemplazar;
	}

	public void setBtReemplazar(Button btReemplazar) {
		this.btReemplazar = btReemplazar;
	}

	public Button getBtReemplazarTodo() {
		return btReemplazarTodo;
	}

	public void setBtReemplazarTodo(Button btReemplazarTodo) {
		this.btReemplazarTodo = btReemplazarTodo;
	}

	public Button getBtCerrar() {
		return btCerrar;
	}

	public void setBtCerrar(Button btCerrar) {
		this.btCerrar = btCerrar;
	}

	public Button getBtAyuda() {
		return btAyuda;
	}

	public void setBtAyuda(Button btAyuda) {
		this.btAyuda = btAyuda;
	}

	public TextField getTfBuscar() {
		return tfBuscar;
	}

	public void setTfBuscar(TextField tfBuscar) {
		this.tfBuscar = tfBuscar;
	}

	public TextField getTfReemplazar() {
		return tfReemplazar;
	}

	public void setTfReemplazar(TextField tfReemplazar) {
		this.tfReemplazar = tfReemplazar;
	}

	public CheckBox getCbMayus() {
		return cbMayus;
	}

	public void setCbMayus(CheckBox cbMayus) {
		this.cbMayus = cbMayus;
	}

	public CheckBox getCbBuscarAtras() {
		return cbBuscarAtras;
	}

	public void setCbBuscarAtras(CheckBox cbBuscarAtras) {
		this.cbBuscarAtras = cbBuscarAtras;
	}

	public CheckBox getCbExpresionRegular() {
		return cbExpresionRegular;
	}

	public void setCbExpresionRegular(CheckBox cbExpresionRegular) {
		this.cbExpresionRegular = cbExpresionRegular;
	}

	public CheckBox getCbResaltarResultados() {
		return cbResaltarResultados;
	}

	public void setCbResaltarResultados(CheckBox cbResaltarResultados) {
		this.cbResaltarResultados = cbResaltarResultados;
	}

}
