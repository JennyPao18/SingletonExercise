public class Main {
    public static void main(String[] args) {
        //Obtener la instancia de la configuración
        AppConfig config = AppConfig.getInstance();

        //-------------------------------------------------------------
        //Mostrar en consola el nombre de usuario
        config.setUsername("Jenny");
        System.out.println("Nombre de Usuario: " + config.getUsername());

        //-------------------------------------------------------------
        //Mostrar en consola la ruta del servidor
        System.out.println("Ruta del Servidor: " +config.getServerUrl());

        //-------------------------------------------------------------
        //Mostrar en consola el puerto
        config.setPort(8080);
        System.out.println("Puerto: " + config.getPort());

        //-------------------------------------------------------------
        //Mostrar en consola la dirección IP
        System.out.println("Dirección IP: " + config.getIpAddress());

        //-------------------------------------------------------------
        //Mostrar en consola la ruta de archivo
        config.setFilePath("/ruta/a/archivo.txt");
        System.out.println("Ruta de Archivo: " + config.getFilePath());
    }
}