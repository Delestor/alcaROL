package com.bemen3.albert.alcarol;

/**
 * Created by alber on 19/05/2017.
 */

public class Constantes {

    /***Constantes de conexion para el web-Service***/
        /*** Puerto que utilizas para la conexión ***/
        private static final String PUERTO_HOST = "";
        ///trabajoWebService/WebService_PHP
        //private static final String rutaPadre = "/M15_UF2/P7_WebService";//Ruta Bemen3 y WebService Amazon
        //private static final String rutaPadre = "/P7_WebService";//Ruta PC Casa
        private static final String rutaPadre = "/alcaRolWebService";

        /*** Dirección IP del emulador o IP Web Service ***/
        //private static final String IP = "http://10.10.0.26";//IP Bemen3
        //private static final String IP = "http://192.168.1.38";//IP casa
        private static final String IP = "http://52.56.253.209";//IP WebService Amazon

        /*** URLs del Web Service ***/
        public static final String LOG_IN = IP + PUERTO_HOST +rutaPadre+ "/login_usuario.php";

        public static final String ACCEDER_CUINER_PLATS = IP + PUERTO_HOST +rutaPadre+ "/cuiner/llistatPlats.php";
        public static final String ACCEDER_MAITRE_PLATS = IP + PUERTO_HOST +rutaPadre+ "/maitre/llistatPlats.php";

        /*** Clave para el valor extra que representa al identificador de una cita ***/
        public static final String EXTRA_ID = "IDEXTRA";





}
