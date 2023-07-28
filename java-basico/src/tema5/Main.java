package tema5;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUD();
        cocheCrud.save();
        cocheCrud.delete();
        cocheCrud.update();
    }
}
interface CocheCRUDlmpl{
    public void save();
    public void delete();
    public void update();
}
class CocheCRUD implements CocheCRUDlmpl{
    public void save(){
        System.out.println("guardado");
    }
    public void delete(){
    System.out.println("borrado");
    }
    public void update(){
        System.out.println("actualizado");
    }
}