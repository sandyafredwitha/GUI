package Tugas07;

import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame {
        private String namaLengkap;
        private String tanggalLahir;
        private String nomorPendaftaran;
        private String nomorTelp;
        private String alamat;
        private String email;
    
        public NewWindow(String namaLengkap, String tanggalLahir, String nomorPendaftaran, String nomorTelp, String alamat, String email) {
            setLayout(null);
    
            this.namaLengkap = namaLengkap;
            this.tanggalLahir = tanggalLahir;
            this.nomorPendaftaran = nomorPendaftaran;
            this.nomorTelp = nomorTelp;
            this.alamat = alamat;
            this.email = email;
    
            setTitle("Data Mahasiswa");
    
            JLabel lbJudul = new JLabel("Data Mahasiswa");
            lbJudul.setFont(new Font("Arial", Font.BOLD, 14));
            add(lbJudul);
            lbJudul.setBounds(100, 30, 250, 20);
    
            JLabel lbNamaLengkap = new JLabel("Nama Lengkap: " + namaLengkap);
            add(lbNamaLengkap);
            lbNamaLengkap.setBounds(50, 60, 300, 25);
    
            JLabel lbTanggalLahir = new JLabel("Tanggal Lahir: " + tanggalLahir);
            add(lbTanggalLahir);
            lbTanggalLahir.setBounds(50, 90, 300, 25);
    
            JLabel lbNomorPendaftaran = new JLabel("No. Pendaftaran: " + nomorPendaftaran);
            add(lbNomorPendaftaran);
            lbNomorPendaftaran.setBounds(50, 120, 300, 25);
    
            JLabel lbNomorTelp = new JLabel("No. Telp: " + nomorTelp);
            add(lbNomorTelp);
            lbNomorTelp.setBounds(50, 150, 300, 25);
    
            JLabel lbAlamat = new JLabel("Alamat: " + alamat);
            add(lbAlamat);
            lbAlamat.setBounds(50, 180, 300, 25);
    
            JLabel lbEmail = new JLabel("Email: " + email);
            add(lbEmail);
            lbEmail.setBounds(50, 210, 300, 25);
        }

        public String getNamaLengkap() {
            return namaLengkap;
        }
    
        public String getTanggalLahir() {
            return tanggalLahir;
        }
    
        public String getNomorPendaftaran() {
            return nomorPendaftaran;
        }
    
        public String getNomorTelp() {
            return nomorTelp;
        }
    
        public String getAlamat() {
            return alamat;
        }
    
        public String getEmail() {
            return email;
        }
    }
    