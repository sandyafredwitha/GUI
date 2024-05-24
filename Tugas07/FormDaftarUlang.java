package Tugas07;
import java.awt.*;

public class FormDaftarUlang extends Frame {
    
    Label lbNamaLengkap, lbTanggalLahir, lbNomorPendaftaran, lbNoTelp, lbAlamat, lbEmail;
    TextField txtNamaLengkap, txtTanggalLahir, txtNomorPendaftaran, txtNoTelp, txtAlamat, txtEmail;
    Button btnSubmit;
    
        public FormDaftarUlang() {
            setLayout(null);
    
            lbNamaLengkap = new Label("Nama Lengkap");
            add(lbNamaLengkap);
            lbNamaLengkap.setBounds(50, 30, 100, 25);
    
            lbTanggalLahir = new Label("Tanggal Lahir");
            add(lbTanggalLahir);
            lbTanggalLahir.setBounds(50, 60, 100, 25);
    
            lbNomorPendaftaran = new Label("Nomor Pendaftaran");
            add(lbNomorPendaftaran);
            lbNomorPendaftaran.setBounds(50, 90, 110, 25);
    
            lbNoTelp = new Label("No. Telp");
            add(lbNoTelp);
            lbNoTelp.setBounds(50, 120, 100, 25);
    
            lbAlamat = new Label("Alamat");
            add(lbAlamat);
            lbAlamat.setBounds(50, 150, 100, 25);
    
            lbEmail = new Label("Email");
            add(lbEmail);
            lbEmail.setBounds(50, 200, 100, 25);
    
            txtNamaLengkap = new TextField(null);
            add(txtNamaLengkap);
            txtNamaLengkap.setBounds(200, 30, 200, 20);
    
            txtTanggalLahir = new TextField(null);
            add(txtTanggalLahir);
            txtTanggalLahir.setBounds(200, 60, 200, 20);
    
            txtNomorPendaftaran = new TextField(null);
            add(txtNomorPendaftaran);
            txtNomorPendaftaran.setBounds(200, 90, 200, 20);
    
            txtNoTelp = new TextField(null);
            add(txtNoTelp);
            txtNoTelp.setBounds(200, 120, 200, 20);
    
            txtAlamat = new TextField(null);
            add(txtAlamat);
            txtAlamat.setBounds(200, 150, 200, 40);
    
            txtEmail = new TextField(null);
            add(txtEmail);
            txtEmail.setBounds(200, 200, 200, 20);
    
            btnSubmit = new Button("submit");
            add(btnSubmit);
            btnSubmit.setBounds(300, 230, 100, 20);
            btnSubmit.addActionListener(new MainAction(this));
        }
    
        public TextField getTxtNamaLengkap() {
            return txtNamaLengkap;
        }
    
        public TextField getTxtTanggalLahir() {
            return txtTanggalLahir;
        }
    
        public TextField getTxtNomorPendaftaran() {
            return txtNomorPendaftaran;
        }
    
        public TextField getTxtNoTelp() {
            return txtNoTelp;
        }
    
        public TextField getTxtAlamat() {
            return txtAlamat;
        }
    
        public TextField getTxtEmail() {
            return txtEmail;
        }
}
