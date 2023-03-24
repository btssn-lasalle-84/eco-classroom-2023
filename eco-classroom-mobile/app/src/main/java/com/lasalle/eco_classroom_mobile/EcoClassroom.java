/**
 * @file EcoClassroom.java
 * @brief Déclaration de l'activité principale EcoClassroom
 * @author Mercklen Jérémy
 */

package com.lasalle.eco_classroom_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

/**
 * @class EcoClassroom
 * @brief L'activité principale
 */
public class EcoClassroom extends AppCompatActivity
{
    /**
     * Constantes
     */
    private static final String TAG =
      "_EcoClassroom_"; //!< TAG pour les logs (cf. Logcat)

    /**
     * Attributs
     */
    private Salle[] Salles;

    /**
     * Ressources GUI
     */

    /**
     * @brief Méthode appelée à la création de l'activité
     */
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate()");
    }

    /**
     * @brief Méthode appelée au démarrage après le onCreate() ou un restart
     * après un onStop()
     */
    @Override protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    /**
     * @brief Méthode appelée après onStart() ou après onPause()
     */
    @Override protected void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    /**
     * @brief Méthode appelée après qu'une boîte de dialogue s'est affichée (on
     * reprend sur un onResume()) ou avant onStop() (activité plus visible)
     */
    @Override protected void onPause()
    {
        super.onPause();
        Log.d(TAG, "onPause()");
    }

    /**
     * @brief Méthode appelée lorsque l'activité n'est plus visible
     */
    @Override protected void onStop()
    {
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    /**
     * @brief Méthode appelée à la destruction de l'application (après onStop()
     * et détruite par le système Android)
     */
    @Override protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    public void afficherSalles()
    {
    }

    public void afficherMesures()
    {
    }

    public void afficherEtats()
    {
    }

    public void afficherUneSalle()
    {
    }

    public void afficherTHI()
    {
    }

    public void afficherIADI()
    {
    }

    public void afficherICONE()
    {
    }

    public void ajouterSalle(String nom, String description, double superficie)
    {
    }
}