package com.eidos.uuid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UUIDService {

    private SplitUUID splitUUID;
    private SummationUUID summationUUID;
    private MaxNumberUUID maxNumberUUID;
    private AddMaxNumbersUUID addMaxNumbersUUID;
    private SortUUID sortUUID;

    public UUIDService(SplitUUID splitUUID, SummationUUID summationUUID, MaxNumberUUID maxNumberUUID, AddMaxNumbersUUID addMaxNumbersUUID, SortUUID sortUUID) {
        this.splitUUID = splitUUID;
        this.summationUUID = summationUUID;
        this.maxNumberUUID = maxNumberUUID;
        this.addMaxNumbersUUID = addMaxNumbersUUID;
        this.sortUUID = sortUUID;
    }

    @RequestMapping("/transform-uuid/{uuid}")
    public String transformUUID(@PathVariable("uuid")String uuid) {
        String[] strings = splitUUID.split(uuid);
        String finalUUID = summationUUID.summation(strings[0]) + "-" + maxNumberUUID.maxNumber(strings[1]) + "-" + addMaxNumbersUUID.addMaxNumbers(strings[2], strings[3]) + "-" + sortUUID.sort(strings[4]);
        return finalUUID;
    }

    @RequestMapping("/transform-uuid")
    public String transformUUIDParam(@RequestParam("uuid")String uuid) {
        String[] strings = splitUUID.split(uuid);
        String finalUUID = summationUUID.summation(strings[0]) + "-" + maxNumberUUID.maxNumber(strings[1]) + "-" + addMaxNumbersUUID.addMaxNumbers(strings[2], strings[3]) + "-" + sortUUID.sort(strings[4]);
        return finalUUID;
    }
}
