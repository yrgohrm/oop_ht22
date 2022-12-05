import java.io.*;
import java.net.*;
import java.util.*;
import java.util.Map.*;

public class QuestionSender implements Runnable {
    private Socket client;
    private BufferedReader input;
    private BufferedWriter output;
    private List<Map.Entry<String, String>> questions;

    public QuestionSender(Socket client, Map<String, String> questions) throws IOException {
        this.client = client;
        this.input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        this.output = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        this.questions = new ArrayList<>();
        for (Map.Entry<String, String> entry : questions.entrySet()) {
            this.questions.add(entry);
        }
        Collections.shuffle(this.questions);
    }

    // i respektive tråd:
    // skicka en fråga
    // ta emot ett svar
    // kontrollera korrekthet
    // skicka tillbaka om det var rätt
    @Override
    public void run() {
        try {
            Map.Entry<String, String> q; 
            while ((q = nextQuestion()) != null) {
                sendQuestion(q);
                String answer = readAnswer();
                sendCorrectness(q, answer);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                client.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void sendCorrectness(Entry<String, String> q, String answer) throws IOException {
        String correctAnswer = q.getValue().trim().toLowerCase();
        output.write(Boolean.toString(answer.equals(correctAnswer)));
        output.write("\n");
        output.flush();
    }

    private String readAnswer() throws IOException {
        String answer = input.readLine();
        answer = answer.trim().toLowerCase();
        return answer;
    }

    private void sendQuestion(Entry<String, String> q) throws IOException {
        output.write(q.getKey());
        output.write("\n");
        output.flush();
    }

    private Map.Entry<String, String> nextQuestion() {
        if (questions.isEmpty()) {
            return null;
        }

        return questions.remove(questions.size()-1);
    }
}
