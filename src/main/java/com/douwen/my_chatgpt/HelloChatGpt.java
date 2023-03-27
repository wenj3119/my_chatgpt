package com.douwen.my_chatgpt;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

/**
 * Description:
 * <p>
 * Created by wenjun4 on 2023/3/27
 */
public class HelloChatGpt {
    public static void main(String[] args) {
        String token = "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";//System.getenv("OPENAI_TOKEN");

        OpenAiService service = new OpenAiService(token);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt("今天天气怎么样？")
                .temperature(0.5)
                .maxTokens(2048)
                .topP(1D)
                .frequencyPenalty(0D)
                .presencePenalty(0D)
                .build();
        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
    }
}
