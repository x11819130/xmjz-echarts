package com.xmjz.echarts;

import com.xmjz.echarts.nativebean.Option;
import com.xmjz.echarts.nativebean.option.Calendar;
import com.xmjz.echarts.nativebean.option.*;
import com.xmjz.echarts.nativebean.option.xAxis.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * 一个Option辅助类
 *
 * @author chengz
 * @date 2021/3/2
 */
public class OptionHelper {
    private final Option option;

    private OptionHelper(Option option) {
        this.option = Objects.requireNonNull(option);
    }

    public static OptionHelper load(Option option) {
        return new OptionHelper(option);
    }

    public Option getOption() {
        return option;
    }

    /**
     * 往option的seriesList中添加series 如果原先不存在seriesList,会先创建
     *
     * @param series 要添加的series
     * @return this
     */
    public OptionHelper addSeries(Series series) {
        getSeriesList().add(series);
        return this;
    }

    public OptionHelper setxAxisData(Data[] xAxisData) {
        setxAxisData(Arrays.asList(xAxisData));
        return this;
    }

    public OptionHelper setxAxisData(List<Data> xAxisData) {
        this.getxAxis().setData(xAxisData);
        return this;
    }

    public OptionHelper setyAxisData(com.xmjz.echarts.nativebean.option.yAxis.Data[] yAxisData) {
        setyAxisData(Arrays.asList(yAxisData));
        return this;
    }

    public OptionHelper setyAxisData(List<com.xmjz.echarts.nativebean.option.yAxis.Data> yAxisData) {
        this.getyAxis().setData(yAxisData);
        return this;
    }

    public OptionHelper setLegendData(com.xmjz.echarts.nativebean.option.legend.Data[] legendData) {
        setLegendData(Arrays.asList(legendData));
        return this;
    }

    public OptionHelper setLegendData(List<com.xmjz.echarts.nativebean.option.legend.Data> legendData) {
        this.getLegend().setData(legendData);
        return this;
    }


    /**
     * 获取seriesList 不存在会创建
     */
    public List<Series> getSeriesList() {
        List<Series> seriesList = option.getSeries();
        if (seriesList == null) {
            seriesList = new ArrayList<>();
            option.setSeries(seriesList);
        }
        return seriesList;
    }

    /**
     * 获取指定索引处的series
     * 不存在或类型不匹配将返回null
     */
    public <T extends Series> T getSeries(int index, Class<T> seriesClass) {
        List<Series> list = getSeriesList();
        Series series = index < list.size() ? list.get(index) : null;
        if (seriesClass.isInstance(series)) {
            return seriesClass.cast(series);
        }
        return null;
    }

    /**
     * 获取指定索引处的series
     * 不存在或类型不匹配将返回null
     */
    public <T extends Series> T getSeries(String name, Class<T> seriesClass) {
        List<Series> list = getSeriesList();
        Optional<Series> series = list.stream().filter(x -> {
            if (seriesClass.isInstance(x)) {
                try {
                    Method getName = x.getClass().getMethod("getName");
                    return name.equals(getName.invoke(x));
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException("getSeries error");
                }
            } else {
                return false;
            }
        }).findFirst();
        @SuppressWarnings("unchecked")
        T t = (T) (series.orElse(null));
        return t;
    }

    /**
     * 获取指定索引处的series
     */
    public Series getSeries(int index) {
        return getSeries(index, Series.class);
    }

    /**
     * 获取指定索引处的series
     */
    public Series getSeries(String name) {
        return getSeries(name, Series.class);
    }

    public Title getTitle() {
        return Optional.ofNullable(option.getTitle()).orElseGet(() -> option.setTitle(new Title()).getTitle());
    }

    public Legend getLegend() {
        return Optional.ofNullable(option.getLegend()).orElseGet(() -> option.setLegend(new Legend()).getLegend());
    }

    public Grid getGrid() {
        return Optional.ofNullable(option.getGrid()).orElseGet(() -> option.setGrid(new Grid()).getGrid());
    }

    public XAxis getxAxis() {
        return Optional.ofNullable(option.getxAxis()).orElseGet(() -> option.setXAxis(new XAxis()).getxAxis());
    }

    public YAxis getyAxis() {
        return Optional.ofNullable(option.getyAxis()).orElseGet(() -> option.setYAxis(new YAxis()).getyAxis());
    }

    public Polar getPolar() {
        return Optional.ofNullable(option.getPolar()).orElseGet(() -> option.setPolar(new Polar()).getPolar());
    }

    public RadiusAxis getRadiusAxis() {
        return Optional.ofNullable(option.getRadiusAxis()).orElseGet(() -> option.setRadiusAxis(new RadiusAxis()).getRadiusAxis());
    }

    public AngleAxis getAngleAxis() {
        return Optional.ofNullable(option.getAngleAxis()).orElseGet(() -> option.setAngleAxis(new AngleAxis()).getAngleAxis());
    }

    public Radar getRadar() {
        return Optional.ofNullable(option.getRadar()).orElseGet(() -> option.setRadar(new Radar()).getRadar());
    }

    public Tooltip getTooltip() {
        return Optional.ofNullable(option.getTooltip()).orElseGet(() -> option.setTooltip(new Tooltip()).getTooltip());
    }

    public AxisPointer getAxisPointer() {
        return Optional.ofNullable(option.getAxisPointer()).orElseGet(() -> option.setAxisPointer(new AxisPointer()).getAxisPointer());
    }

    public Toolbox getToolbox() {
        return Optional.ofNullable(option.getToolbox()).orElseGet(() -> option.setToolbox(new Toolbox()).getToolbox());
    }

    public Brush getBrush() {
        return Optional.ofNullable(option.getBrush()).orElseGet(() -> option.setBrush(new Brush()).getBrush());
    }

    public Geo getGeo() {
        return Optional.ofNullable(option.getGeo()).orElseGet(() -> option.setGeo(new Geo()).getGeo());
    }

    public Parallel getParallel() {
        return Optional.ofNullable(option.getParallel()).orElseGet(() -> option.setParallel(new Parallel()).getParallel());
    }

    public ParallelAxis getParallelAxis() {
        return Optional.ofNullable(option.getParallelAxis()).orElseGet(() -> option.setParallelAxis(new ParallelAxis()).getParallelAxis());
    }

    public SingleAxis getSingleAxis() {
        return Optional.ofNullable(option.getSingleAxis()).orElseGet(() -> option.setSingleAxis(new SingleAxis()).getSingleAxis());
    }

    public Timeline getTimeline() {
        return Optional.ofNullable(option.getTimeline()).orElseGet(() -> option.setTimeline(new Timeline()).getTimeline());
    }

    public Graphic getGraphic() {
        return Optional.ofNullable(option.getGraphic()).orElseGet(() -> option.setGraphic(new Graphic()).getGraphic());
    }

    public Calendar getCalendar() {
        return Optional.ofNullable(option.getCalendar()).orElseGet(() -> option.setCalendar(new Calendar()).getCalendar());
    }

    public Dataset getDataset() {
        return Optional.ofNullable(option.getDataset()).orElseGet(() -> option.setDataset(new Dataset()).getDataset());
    }

    public Aria getAria() {
        return Optional.ofNullable(option.getAria()).orElseGet(() -> option.setAria(new Aria()).getAria());
    }

    public TextStyle getTextStyle() {
        return Optional.ofNullable(option.getTextStyle()).orElseGet(() -> option.setTextStyle(new TextStyle()).getTextStyle());
    }
}