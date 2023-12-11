/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mlqapplication;

/**
 *
 * @author aadil
 */
public class Process {
    String processId;
    int burst;
    int time;

    public Process(String processId, int time, int burst) {
        this.processId = processId;
        this.burst = burst;
        this.time = time;
    }

    public String getProcessId() {
        return processId;
    }

    public int getBurst() {
        return burst;
    }
    
    public int getTime() {
        return time;
    }
}
