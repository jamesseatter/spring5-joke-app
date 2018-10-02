package eu.seatter.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    @Override
    public String getJoke() {
        ChuckNorrisQuotes cq = new ChuckNorrisQuotes();
        return cq.getRandomQuote();
    }
}
