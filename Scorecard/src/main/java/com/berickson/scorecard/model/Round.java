package com.berickson.scorecard.model;

import java.util.List;
import java.util.Map;

/**
 * Created by berickson926 on 10/28/2015
 * Copyright (c) 2014 Enplug, Inc. All rights reserved.
 */
public class Round
{
    private List<String> _players;
    private Map<String, Integer> _roundScore;

    public Round(List<String> players)
    {
        _players = players;
    }
}
