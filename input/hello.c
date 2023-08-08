local int test_and_set(flag)
    int volatile *flag;
{
    int was;

    was = *flag;
    *flag = 1;
    return was;
}