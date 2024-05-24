package Tugas07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MainAction implements ActionListener {
    private FormDaftarUlang form;

    public MainAction(FormDaftarUlang form) {
        this.form = form;
    }

    public void actionPerformed(ActionEvent e) {
        String namaLengkap = form.getTxtNamaLengkap().getText().trim();
        String tanggalLahir = form.getTxtTanggalLahir().getText().trim();
        String nomorPendaftaran = form.getTxtNomorPendaftaran().getText().trim();
        String nomorTelp = form.getTxtNoTelp().getText().trim();
        String alamat = form.getTxtAlamat().getText().trim();
        String email = form.getTxtEmail().getText().trim();

        boolean fieldTerisi = true;
        String emptyMessage = "Mohon diisi terlebih dahulu!";

        switch (fieldValidation(namaLengkap, tanggalLahir, nomorPendaftaran, nomorTelp, alamat, email)) {
            case "NamaLengkap":
                form.getTxtNamaLengkap().setText(emptyMessage);
                fieldTerisi = false;
                break;
            case "TanggalLahir":
                form.getTxtTanggalLahir().setText(emptyMessage);
                fieldTerisi = false;
                break;
            case "NomorPendaftaran":
                form.getTxtNomorPendaftaran().setText(emptyMessage);
                fieldTerisi = false;
                break;
            case "NomorTelp":
                form.getTxtNoTelp().setText(emptyMessage);
                fieldTerisi = false;
                break;
            case "Alamat":
                form.getTxtAlamat().setText(emptyMessage);
                fieldTerisi = false;
                break;
            case "Email":
                form.getTxtEmail().setText(emptyMessage);
                fieldTerisi = false;
                break;
            default:
                break;
        }

        if (fieldTerisi) {
            int confirmation = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                NewWindow newWindow = new NewWindow(namaLengkap, tanggalLahir, nomorPendaftaran, nomorTelp, alamat, email);
                newWindow.setSize(400, 350);
                newWindow.setVisible(true);
            }
        }
    }

    private String fieldValidation(String namaLengkap, String tanggalLahir, String nomorPendaftaran, String nomorTelp, String alamat, String email) {
        if (namaLengkap.isEmpty()) {
            return "NamaLengkap";
        } else if (tanggalLahir.isEmpty()) {
            return "TanggalLahir";
        } else if (nomorPendaftaran.isEmpty()) {
            return "NomorPendaftaran";
        } else if (nomorTelp.isEmpty()) {
            return "NomorTelp";
        } else if (alamat.isEmpty()) {
            return "Alamat";
        } else if (email.isEmpty()) {
            return "Email";
        }
        return "AllFieldsFilled";
    }
}