package com.example.demo;

import com.example.demo.model.Vocab;
import com.example.demo.repository.VocabRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VocabRepository vocabRepository;

    // Inject the repository via constructor
    public DataLoader(VocabRepository vocabRepository) {
        this.vocabRepository = vocabRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        if (vocabRepository.count() == 0) {
            vocabRepository.save(new Vocab("Adept", "Highly skilled or proficient"));
            vocabRepository.save(new Vocab("Belligerent", "Hostile and aggressive"));
            vocabRepository.save(new Vocab("Cacophony", "A harsh, discordant mixture of sounds"));
            vocabRepository.save(new Vocab("Debilitate", "To weaken or make feeble"));
            vocabRepository.save(new Vocab("Ebullient", "Overflowing with enthusiasm"));
            vocabRepository.save(new Vocab("Facilitate", "To make easier or help bring about"));
            vocabRepository.save(new Vocab("Garrulous", "Excessively talkative"));
            vocabRepository.save(new Vocab("Harangue", "A lengthy and aggressive speech"));
            vocabRepository.save(new Vocab("Iconoclast", "One who attacks traditional beliefs"));
            vocabRepository.save(new Vocab("Juxtapose", "To place side by side for comparison"));
            vocabRepository.save(new Vocab("Keen", "Having a sharp edge or intellect"));
            vocabRepository.save(new Vocab("Lament", "To mourn or express sorrow"));
            vocabRepository.save(new Vocab("Malleable", "Capable of being shaped or changed"));
            vocabRepository.save(new Vocab("Nefarious", "Wicked or criminal"));
            vocabRepository.save(new Vocab("Obfuscate", "To confuse or make unclear"));
            vocabRepository.save(new Vocab("Palpable", "Able to be touched or felt"));
            vocabRepository.save(new Vocab("Quell", "To suppress or put an end to"));
            vocabRepository.save(new Vocab("Rancor", "Bitter resentment or ill will"));
            vocabRepository.save(new Vocab("Sagacious", "Wise or shrewd"));
            vocabRepository.save(new Vocab("Tangible", "Capable of being touched; real"));
            vocabRepository.save(new Vocab("Ubiquitous", "Present everywhere"));
            vocabRepository.save(new Vocab("Vacillate", "To waver between different opinions"));
            vocabRepository.save(new Vocab("Wane", "To decrease gradually"));
            vocabRepository.save(new Vocab("Xenophobia", "Fear or hatred of foreigners"));
            vocabRepository.save(new Vocab("Yearn", "To have a strong desire"));
            vocabRepository.save(new Vocab("Zealous", "Filled with passion or enthusiasm"));
            vocabRepository.save(new Vocab("Ameliorate", "To improve or make better"));
            vocabRepository.save(new Vocab("Burgeon", "To grow or flourish rapidly"));
            vocabRepository.save(new Vocab("Capitulate", "To surrender or give in"));
            vocabRepository.save(new Vocab("Deleterious", "Causing harm or damage"));
            vocabRepository.save(new Vocab("Enervate", "To weaken or drain energy"));
            vocabRepository.save(new Vocab("Flummox", "To confuse or perplex"));
            vocabRepository.save(new Vocab("Gregarious", "Sociable; fond of company"));
            vocabRepository.save(new Vocab("Hapless", "Unlucky; unfortunate"));
            vocabRepository.save(new Vocab("Impetuous", "Acting quickly without thought"));
            vocabRepository.save(new Vocab("Judicious", "Having good judgment"));
            vocabRepository.save(new Vocab("Kudos", "Praise or acclaim"));
            vocabRepository.save(new Vocab("Lethargic", "Sluggish or lacking energy"));
            vocabRepository.save(new Vocab("Mundane", "Commonplace or ordinary"));
            vocabRepository.save(new Vocab("Nonchalant", "Calm and unconcerned"));
            vocabRepository.save(new Vocab("Ostentatious", "Showy or pretentious"));
            vocabRepository.save(new Vocab("Perfunctory", "Done without care or interest"));
            vocabRepository.save(new Vocab("Querulous", "Complaining or whining"));
            vocabRepository.save(new Vocab("Recalcitrant", "Stubbornly disobedient"));
            vocabRepository.save(new Vocab("Serendipity", "Luck in finding good things by chance"));
            vocabRepository.save(new Vocab("Taciturn", "Reserved or uncommunicative"));
            vocabRepository.save(new Vocab("Abhor", "To hate deeply"));
            vocabRepository.save(new Vocab("Beguile", "To charm or deceive"));
            vocabRepository.save(new Vocab("Cajole", "To persuade by flattery"));
            vocabRepository.save(new Vocab("Dauntless", "Fearless; undaunted"));
            vocabRepository.save(new Vocab("Egregious", "Outstandingly bad"));
            vocabRepository.save(new Vocab("Fervent", "Passionate or intense"));
            vocabRepository.save(new Vocab("Guile", "Sly or cunning intelligence"));
            vocabRepository.save(new Vocab("Hinder", "To create difficulties or delay"));
            vocabRepository.save(new Vocab("Immaculate", "Perfectly clean or spotless"));
            vocabRepository.save(new Vocab("Jocular", "Joking or humorous"));
            vocabRepository.save(new Vocab("Knavery", "Dishonest or unscrupulous behavior"));
            vocabRepository.save(new Vocab("Luminous", "Emitting light; bright"));
            vocabRepository.save(new Vocab("Magnanimous", "Generous or forgiving"));
            vocabRepository.save(new Vocab("Nurture", "To care for and encourage growth"));
            vocabRepository.save(new Vocab("Ominous", "Threatening or foreboding"));
            vocabRepository.save(new Vocab("Paragon", "A model of excellence"));
            vocabRepository.save(new Vocab("Querulous", "Complaining in a whining manner"));
            vocabRepository.save(new Vocab("Resolute", "Determined; unwavering"));
            vocabRepository.save(new Vocab("Stoic", "Enduring pain or hardship without complaint"));
            vocabRepository.save(new Vocab("Trepidation", "Fear or anxiety about the future"));
            vocabRepository.save(new Vocab("Uncanny", "Strange or mysterious"));
            vocabRepository.save(new Vocab("Verbose", "Using more words than needed"));
            vocabRepository.save(new Vocab("Wistful", "Full of longing or desire"));
            vocabRepository.save(new Vocab("Yield", "To give way or submit"));
            vocabRepository.save(new Vocab("Zephyr", "A gentle breeze"));
            vocabRepository.save(new Vocab("Altruistic", "Unselfishly concerned for others"));
            vocabRepository.save(new Vocab("Benevolent", "Kind and generous"));
            vocabRepository.save(new Vocab("Censure", "To express strong disapproval"));
            vocabRepository.save(new Vocab("Defer", "To postpone or delay"));
            vocabRepository.save(new Vocab("Ebullient", "Cheerful and full of energy"));
            vocabRepository.save(new Vocab("Furtive", "Secretive; stealthy"));
            vocabRepository.save(new Vocab("Grandiose", "Impressive or magnificent"));
            vocabRepository.save(new Vocab("Harbinger", "A person or thing that signals the approach of another"));
            vocabRepository.save(new Vocab("Impetuous", "Acting without thinking"));
            vocabRepository.save(new Vocab("Jaded", "Tired or lacking enthusiasm"));
            vocabRepository.save(new Vocab("Kindred", "Similar in nature or character"));
            vocabRepository.save(new Vocab("Lethargy", "Lack of energy; sluggishness"));
            vocabRepository.save(new Vocab("Mollify", "To soothe or calm"));
            vocabRepository.save(new Vocab("Nefarious", "Wicked or criminal"));
            vocabRepository.save(new Vocab("Obsolete", "No longer in use"));
            vocabRepository.save(new Vocab("Pensive", "Deep in thought"));
            vocabRepository.save(new Vocab("Quixotic", "Unrealistic and impractical"));
            vocabRepository.save(new Vocab("Rhetoric", "The art of persuasive speaking or writing"));
            vocabRepository.save(new Vocab("Sanguine", "Optimistic or positive"));
            vocabRepository.save(new Vocab("Tangible", "Capable of being touched"));
            vocabRepository.save(new Vocab("Ubiquitous", "Present everywhere"));
            vocabRepository.save(new Vocab("Vacillate", "To waver between decisions"));
            vocabRepository.save(new Vocab("Wrath", "Extreme anger"));
            vocabRepository.save(new Vocab("Xenial", "Hospitable, especially to strangers"));

        }
    }
}
