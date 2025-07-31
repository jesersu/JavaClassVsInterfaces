package SOLID.DepdencyInversion;

public class UserService {
    private DataBase baseDatos;
    public UserService(DataBase baseDatos)
    {
        this.baseDatos = baseDatos;
    }

    public void GuardarUsuario()
    {
        baseDatos.saveData();
    }
}
