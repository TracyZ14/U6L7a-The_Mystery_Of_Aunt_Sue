public class AuntSue
{
    private int number;
    private int children;
    private int cats;
    private int samoyeds;
    private int pomeranians;
    private int akitas;
    private int vizslas;
    private int goldfish;
    private int trees;
    private int cars;
    private int perfumes;
    private boolean isRealSue;

    public AuntSue(int number)
    {
        this.number = number;
        children = -1;
        cats = -1;
        samoyeds = -1;
        pomeranians = -1;
        akitas = -1;
        vizslas = -1;
        goldfish = -1;
        trees = -1;
        cars = -1;
        perfumes = -1;
        isRealSue = true;
    }

    public int getNumber()
    {
        return number;
    }

    public int getChildren()
    {
        return children;
    }

    public void setChildren(int children)
    {
        this.children = children;
    }

    public int getCats()
    {
        return cats;
    }

    public void setCats(int cats)
    {
        this.cats = cats;
    }

    public int getSamoyeds()
    {
        return samoyeds;
    }

    public void setSamoyeds(int samoyeds)
    {
        this.samoyeds = samoyeds;
    }

    public int getPomeranians()
    {
        return pomeranians;
    }

    public void setPomeranians(int pomeranians)
    {
        this.pomeranians = pomeranians;
    }

    public int getAkitas()
    {
        return akitas;
    }

    public void setAkitas(int akitas)
    {
        this.akitas = akitas;
    }

    public int getVizslas()
    {
        return vizslas;
    }

    public void setVizslas(int vizslas)
    {
        this.vizslas = vizslas;
    }

    public int getGoldfish()
    {
        return goldfish;
    }

    public void setGoldfish(int goldfish)
    {
        this.goldfish = goldfish;
    }

    public int getTrees()
    {
        return trees;
    }

    public void setTrees(int trees)
    {
        this.trees = trees;
    }

    public int getCars()
    {
        return cars;
    }

    public void setCars(int cars)
    {
        this.cars = cars;
    }

    public int getPerfumes()
    {
        return perfumes;
    }

    public void setPerfumes(int perfumes)
    {
        this.perfumes = perfumes;
    }

    public boolean isRealSue()
    {
        return isRealSue;
    }

    public void setRealSue(boolean realSue)
    {
        isRealSue = realSue;
    }

    public void updateSue(String data)
    {
        String[] information = {"children", "cats", "samoyeds", "pomeranians", "akitas", "vizslas", "goldfish", "trees", "cars"};
        for(String info : information)
        {
            if(data.contains(info))
            {
                int infoIndex = data.indexOf(info);
                String infoData = data.substring(infoIndex);
                boolean hasComma = infoData.contains(",");
                if(hasComma)
                {
                    int commaIndex = infoData.indexOf(",");
                    infoData = infoData.substring(0, commaIndex);
                }
                int infoValueIndex = infoData.indexOf(" ") + 1;
                String infoValue = infoData.substring(infoValueIndex);
                int value = Integer.parseInt(infoValue);
                if(info.equals("children"))
                {
                    setChildren(value);
                }
                if(info.equals("cats"))
                {
                    setCats(value);
                }
                if(info.equals("samoyeds"))
                {
                    setSamoyeds(value);
                }
                if(info.equals("pomeranians"))
                {
                    setPomeranians(value);
                }
                if(info.equals("akitas"))
                {
                    setAkitas(value);
                }
                if(info.equals("vizslas"))
                {
                    setAkitas(value);
                }
                if(info.equals("goldfish"))
                {
                    setGoldfish(value);
                }
                if(info.equals("trees"))
                {
                    setTrees(value);
                }
                if(info.equals("cars"))
                {
                    setCars(value);
                }
                if(info.equals("perfumes"))
                {
                    setPerfumes(value);
                }
            }
        }
    }

    public void compareSues()
    {
        int dataMatches = 0;
        if(getChildren() == 3)
        {
            dataMatches++;
        }
        if(getCats() == 7)
        {
            dataMatches++;
        }
        if(getSamoyeds() == 2)
        {
            dataMatches++;
        }
        if(getPomeranians() == 3)
        {
            dataMatches++;
        }
        if(getAkitas() == 0)
        {
            dataMatches++;
        }
        if(getVizslas() == 0)
        {
            dataMatches++;
        }
        if(getGoldfish() == 5)
        {
            dataMatches++;
        }
        if(getTrees() == 3)
        {
            dataMatches++;
        }
        if(getCars() == 2)
        {
            dataMatches++;
        }
        if(getPerfumes() == 1)
        {
            dataMatches++;
        }
        if(dataMatches != 3)
        {
            setRealSue(false);
        }
    }
}