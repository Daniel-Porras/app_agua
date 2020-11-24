package com.example.aplicacion_agua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.service.autofill.Dataset;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class Boton4 extends AppCompatActivity {
    private BarChart barChart;
    private String[] dias = new String[]{"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    private float[] datos=new float []{6.1f,5.4f,3.9f,4.4f,4.9f,5.3f,5.3f};
    private int[] colores=new int[]{Color.BLUE, Color.GREEN,Color.RED,Color.YELLOW,Color.CYAN,Color.GRAY,Color.MAGENTA};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton4);
        barChart=(BarChart)findViewById(R.id.barChart);
        createCharts();
    }
    private Chart getSameChart(Chart chart,String description,int textColor,int background,int animatey ){
        chart.getDescription().setText(description);
        chart.getDescription().setTextSize(15);
        chart.setBackgroundColor(background);
        chart.animateY(animatey);
        legend(chart);
        return chart;
    }

    private void legend(Chart chart){
        Legend legend= chart.getLegend();
        legend.setForm(Legend.LegendForm.CIRCLE);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);

        ArrayList<LegendEntry>entries=new ArrayList<>();
        for (int i=0;i<dias.length;i++){
            LegendEntry entry =new LegendEntry();
            entry.formColor=colores[i];
            entry.label=dias[i];
            entries.add(entry);
        }
        legend.setCustom(entries);
    }

    private ArrayList<BarEntry>getBarEntries(){
        ArrayList<BarEntry> entries = new ArrayList<>();
        for (int i=0;i<datos.length;i++){
            entries.add(new BarEntry(i,datos[i]));
        }
        return entries ;
    }
    private void axisX(XAxis axis){
        axis.setGranularityEnabled(true);
        axis.setPosition(XAxis.XAxisPosition.BOTTOM);
        axis.setValueFormatter(new IndexAxisValueFormatter(dias));
        axis.setEnabled(false);
    }

    private void axisLeft(YAxis axis){
        axis.setSpaceTop(20);
        axis.setAxisMinimum(0);
        axis.setGranularity(0.5f);
    }

    private void axisRight(YAxis axis){
        axis.setEnabled(false);
    }

    public void createCharts(){
        barChart= (BarChart)getSameChart(barChart,"Consumo",Color.BLACK,Color.TRANSPARENT,3000);
        barChart.setDrawGridBackground(true);
        barChart.setDrawBarShadow(true);
        barChart.setData(getBarData());
        barChart.invalidate();
        axisX(barChart.getXAxis());
        axisLeft(barChart.getAxisLeft());
        axisRight(barChart.getAxisRight());
    }
    private DataSet getData(DataSet dataSet){
        dataSet.setColors(colores);
        dataSet.setValueTextSize(Color.WHITE);
        dataSet.setValueTextSize(10);
        return dataSet;

    }
    private BarData getBarData(){
        BarDataSet barDataSet=(BarDataSet)getData(new BarDataSet(getBarEntries(),""));

        barDataSet.setBarShadowColor(Color.TRANSPARENT);
        BarData barData=new BarData(barDataSet);
        barData.setBarWidth(0.45f);
        return barData;
    }


    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity3.class);
        startActivity(volver);
    }
}