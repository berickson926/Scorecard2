package com.berickson.scorecard.model;

import java.util.List;
import java.util.Map;

/**
 * Created by berickson926 on 10/28/2015
 * Copyright (c) 2014 Enplug, Inc. All rights reserved.
 */
public class Game
{
    private List<String> _players;
    private Map<String, Integer> _totalScores;
    private List<Round> _rounds;

    public Game(List<String> players)
    {
        _players = players;
    }


}
