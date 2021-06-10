package worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.List;

/**
 * Created by servicium on 28.09.2016.
 */
public class WorkerDemo extends JFrame {
    private boolean isStarted = false;
    private JLabel counterLabel = new JLabel("Not started");
    private Worker worker = new Worker();
    private JButton startButton = new JButton(new AbstractAction("Start") {

        public void actionPerformed(ActionEvent arg0) {
            if (!isStarted) {
                worker.execute();
                isStarted = true;
            }
        }

    });
    private JButton stopButton = new JButton(new AbstractAction("Stop") {

        public void actionPerformed(ActionEvent arg0) {
            worker.cancel(true);
        }

    });

    public WorkerDemo() {

        add(startButton, BorderLayout.WEST);
        add(counterLabel, BorderLayout.CENTER);
        add(stopButton, BorderLayout.EAST);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class Worker extends SwingWorker<Void, Integer> {

        int counter = 0;

        @Override
        protected Void doInBackground() throws Exception {
            while (true) {
                counter++;
                publish(counter);
                Thread.sleep(60);
            }
        }

        @Override
        protected void process(List<Integer> chunks) {
            Integer counterChunk = chunks.get(chunks.size() - 1);

            counterLabel.setText(counterChunk.toString());
        }


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WorkerDemo();
            }

        });
    }

}